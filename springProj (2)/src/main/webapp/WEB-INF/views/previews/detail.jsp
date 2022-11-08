<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script type="text/javascript" src="/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
function fn_chk() {
   let userPw = document.getElementById("userPw").value;
   let userPwCheck = document.getElementById("userPwCheck").value;
   // 비밀번호가 다를 때 보여주는 멘트 영역
   console.log("userPw : " + userPw + ", userPwCheck : " + userPwCheck);
   
   if(userPw != userPwCheck) {
      $("#chkPw").html("비밀번호가 다릅니다");
      return false;
   }
   
   return true;
}
</script>
<script type="text/javascript">
$(function() {
   $("#btnAdd").on("click", function() {
 	  console.log("왔냐?");
 	  $(".a1").append(
 			 '<input class="form-control form-control-user" path="attachVOList[0].filename" id="filename" name="filename" placeholder="첨부파일명" /><br>'
 			 );
 	  console.log("왔어?");
   });
});
$(function() {
   $("#btnRemove").on("click", function() {
 	  console.log("왔냐?");
 	  $(".a1").html(
 			 '<input class="form-control form-control-user" path="attachVOList[0].filename" id="filename" name="filename" placeholder="첨부파일명" /><br>'
 			 );
 	  console.log("왔어?");
   });
   

	$("#userPw").focusout(function() {
			let userPw = $(this).val();

			let userNo = "${param.userNo}";

			console.log("userNo : " + userNo + ", userPw : " + userPw);

			let data = {
				"userNo" : userNo,
				"userPw" : userPw
			};

			$.ajax({
				url : "/previews/detailPwCheck",
				contentType : "application/json;charset:utf-8",
				data : JSON.stringify(data),
				type : "post",
				dataType : "json",
				success : function(rslt) {
					console.log("rslt : " + JSON.stringify(rslt));
					let cnt = rslt.result;
					if (cnt > 0) {
						$("#btnSubmit").removeAttr("disabled");
					} else {
						$("#btnSubmit").attr("disabled","disabled");
					}

				}
			});
		});
	});
</script>
<div class="container">
   <div class="card o-hidden border-0 shadow-lg my-5">
       <div class="card-body p-0">
           <!-- Nested Row within Card Body -->
            <div class="row">
            	<!-- 왼쪽 대표 이미지 -->
                <div class="col-lg-5 d-none d-lg-block bg-register-image" 
                	<c:if test="${memVO.attachVOList[0].filename!=null}">
                   	style="background-image:url('/resources/upload${memVO.attachVOList[0].filename}');background-size:cover;"
                   	</c:if>
                   	></div>
                <div class="col-lg-7">
                    <div class="p-5">
                        <!-- <form id="memVO" -->
                        <form:form modelAttribute="memVO" class="user" method="post"
                           action="/previews/updatePost" onsubmit="return fn_chk()">
                           <form:hidden path="userNo" />
                            <div class="form-group row">
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                   <!-- input type="text" -> form:input -->
                                   <!-- id="userId" name="userId" -> path="userId" -->
                                    <form:input class="form-control form-control-user" 
                                    path="userId" placeholder="userId" readonly="true" />
                                    <font color="red">
                              <form:errors path="userId" />                                       
                                    </font>
                                </div>
                                <div class="col-sm-6">
                                    <form:input class="form-control form-control-user" 
                                    path="userName" placeholder="userName" readonly="true" />
                                    <font color="red">
                              <form:errors path="userName" />                                       
                                    </font>
                                </div>
                            </div>
                            <div class="form-group">
                                <form:input class="form-control form-control-user" 
                                path="userEmail" placeholder="Email Address" readonly="true" />
                                <font color="red">
                              <form:errors path="userEmail" />                                       
                                </font>
                            </div>
                            <div class="form-group">
                                <form:input class="form-control form-control-user" 
                                path="updDate" placeholder="변경일자(yyyyMMdd)" readonly="true" />
                                <font color="red">
                              <form:errors path="updDate" />                                       
                                </font>
                            </div>
                            <!------------ 일반모드 시작 ------------>
                            <div id="spn1">
	                            <div class="form-group a1">
	                               <!-- attachVOList : List<AttachVO>
	                                  attachVOList[0] : AttachVO
	                                -->
	                                <c:forEach var="attachVO" items="${memVO.attachVOList}">
									<c:set var="filename" value="${attachVO.filename}" />
									<c:set var="filenameLen" value="${fn:length(filename)}" />
	                                <img src="/resources/upload${fn:substring(filename,0,12)}s_${fn:substring(filename,12,filenameLen)}" />
	                                </c:forEach>
	                                <form:input class="form-control form-control-user" 
	                                path="attachVOList[0].filename" id="filename" name="filename" placeholder="첨부파일명" />
	                                	<font color="red">
	                              			<form:errors path="attachVOList[0].filename" />                                       
	                                	</font>
	                            </div>
                            	<p>
                            		<button type="button" id="edit"
                            		 	class="btn btn-outline-success btn-user btn-block"
                            		 	style="width:50%;float:left;">
		                            	수정
		                            </button>
		                            <button type="button" id="delete"
                            		 	class="btn btn-outline-danger btn-user btn-block"
                            		 	style="width:50%;">
		                            	삭제
		                            </button>
                            	</p>
                            	<p>
                            		<a href="/previews/list"
                            		 	class="btn btn-outline-primary btn-user btn-block">
		                            	목록
		                            </a>
                            	</p>
                            </div>
                            <!------------ 일반모드 끝 ------------>
                            <!------------ 수정모드 시작 ------------>
                            <div id="spn2" style="display:none;">
                            <a href="#" id="btnAdd" class="btn btn-success btn-circle btn-sm">
                               <i class="fas fa-check"></i>
                            </a>
                            <a href="#" id="btnRemove" class="btn btn-danger btn-circle btn-sm">
                                <i class="fas fa-trash"></i>
                            </a>
                            <div class="form-group a1">
                               <!-- attachVOList : List<AttachVO>
                                  attachVOList[0] : AttachVO
                                -->
                                <form:input class="form-control form-control-user" 
                                path="attachVOList[0].filename" id="filename" name="filename" placeholder="첨부파일명" />
                                <font color="red">
                              <form:errors path="attachVOList[0].filename" />                                       
                                </font>
                            </div>
                            <div class="form-group row">
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                   <!-- input="password" -> form:password -->
                                   <!-- id="userPw" name="userPw" -> from:password -->
                                    <form:password class="form-control form-control-user" 
                                    path="userPw" placeholder="Password" />
                                    <font color="red">
                              <form:errors path="userPw" />                                       
                                   </font>
                                </div>
                                <div class="col-sm-6">
                                    <input type="password" class="form-control form-control-user" 
                                    id="userPwCheck" placeholder="Repeat Password" />
                                    <font color="red">
                             		 <span id="spanPwCheck"></span>                                      
                                   </font>
                                </div>
                            </div>
                            <button type="submit" id="btnSubmit"
                            class="btn btn-primary btn-user btn-block"
                            disabled="disabled">
                            	확인
                            </button>
                            <a href="/previews/detail?userNo=${param.userNo}" class="btn btn-primary btn-user btn-block">
                            	취소
                            </a>
                            </div>
                            <!-- 수정모드 끝 -->
                        </form:form>
                        <p /><p /><p /><p /><p /><p /><br /><br /><br /><br />
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
$(function() {
	$("#edit").on("click", function() {
		//일반모드 가리고
		$("#spn1").css("display","none");
		//수정모드 보이고
		$("#spn2").css("display","block");
		//입력란 활성화
		$(".form-control-user").removeAttr("readonly");
		$("img").remove();
		$("#userId").attr("readonly","true");
	});
	
	//삭제버튼 클릭
	$("#delete").on("click",function() {
		$("#memVO").attr("action","/previews/deletePost");
		
		//true(1) / false(0)
		let result = confirm("삭제하시겠습니까?");
		
		console.log("result : " + result);
		
		if (result>0) {
			$("#memVO").submit();
		} else {
			alert("삭제가 취소되었습니다.")
		}
	});
});
</script>