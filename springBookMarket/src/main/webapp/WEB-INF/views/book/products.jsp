<%@page import="kr.or.ddit.vo.BookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="exceptionNoPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" 
   href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>도서 목록</title>
</head>
<body>
   <!-- 머리글에 해당하는 menu.jsp 파일의 내용을 포함하도록
   include 액션 태그를 작성 -->
   <jsp:include page="menu.jsp" />
   <div class="jumbotron">
      <!-- 내용 들어온다 -->
      <div class="container">
         <h1 class="display-3">도서 목록</h1>
      </div>
   </div>
   <!--============= 도서 목록 시작 ================-->
   <div class="container">
      <div class="row" style="justify-content:right;margin:0 0 30px 0;">
         <a href="/addBook" class="btn btn-primary"
         style="float:right;clear:both;">도서 추가</a>
   </div>
      <div class="row" align="left">
         <c:forEach var="bookVO" items="${data}">
            <div class="col-md-4">
               <img alt="${bookVO.name}" title="${bookVO.name}" src="/BookMarket/resources/images/${bookVO.filename}" style="width:50%; height:50%;">
               <h3>${bookVO.category}${bookVO.name}</h3>
               <div>
                  <div>${bookVO.description}</div>
                  <p>
                     <a href="/product?bookId=${bookVO.bookId}" class="btn btn-secondary" role="button">상세 정보&raquo;</a>
                  </p>
               </div>
               <h5>${bookVO.author}|${bookVO.publisher}|${bookVO.unitPrice}원</h5>
               
               <hr />
            </div>
         </c:forEach>
      </div>
   </div>
   <!--============= 도서 목록 끝==================-->
   <jsp:include page="footer.jsp" />
</body>
</html>