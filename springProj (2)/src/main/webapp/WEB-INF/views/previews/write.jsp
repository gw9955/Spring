<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script type="text/javascript" src="/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
function fn_chk() {
   let userPw = document.getElementById("userPw").value;
   let userPwCheck = document.getElementById("userPwCheck").value;
   // 비밀번호가 다를 때 보여주는 멘트 영역
   let spanPwCheck = document.getElementById("spanPwCheck");
   
   console.log("userPw : " + userPw + ", userPwCheck : " + userPwCheck);
   
   if(userPw != userPwCheck) {
      spanPwCheck.innerHTML = "비밀번호가 다릅니다.";
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
});
</script>
<div class="container">
   <div class="card o-hidden border-0 shadow-lg my-5">
       <div class="card-body p-0">
           <!-- Nested Row within Card Body -->
            <div class="row">
                <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                <div class="col-lg-7">
                    <div class="p-5">
                        <div class="text-center">
                            <h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
                        </div>
                        <form:form modelAttribute="memVO" class="user" method="post"
                           action="/previews/writePost" onsubmit="return fn_chk()">
                            <div class="form-group row">
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                   <!-- input type="text" -> form:input -->
                                   <!-- id="userId" name="userId" -> path="userId" -->
                                    <form:input class="form-control form-control-user" 
                                    path="userId" placeholder="userId" />
                                    <font color="red">
                              <form:errors path="userId" />                                       
                                    </font>
                                </div>
                                <div class="col-sm-6">
                                    <form:input class="form-control form-control-user" 
                                    path="userName" placeholder="userName" />
                                    <font color="red">
                              <form:errors path="userName" />                                       
                                    </font>
                                </div>
                            </div>
                            <div class="form-group">
                                <form:input class="form-control form-control-user" 
                                path="userEmail" placeholder="Email Address" />
                                <font color="red">
                              <form:errors path="userEmail" />                                       
                                </font>
                            </div>
                            <div class="form-group">
                                <form:input class="form-control form-control-user" 
                                path="updDate" placeholder="변경일자(yyyyMMdd)" />
                                <font color="red">
                              <form:errors path="updDate" />                                       
                                </font>
                            </div>
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
                            <input type="submit" class="btn btn-primary btn-user btn-block"
                               value="Register Account" />
                        </form:form>
                        <p /><p /><p /><p /><p /><p /><br /><br /><br /><br />
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>