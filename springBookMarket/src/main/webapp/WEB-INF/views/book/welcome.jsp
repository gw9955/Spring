<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>
	<%! //선언문 태그
		//전역 변수
		String greeting = "도서 웹 쇼핑몰";
		String tagline = "Welcome to Web Market!";
	%>
	<!-- 표현문 -->
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3"><%=greeting%></h1>
		</div>
	</div>
	<main role="main">
		<div class = "container">
			<div class="text-center">
				<h3><%=tagline%></h3>
			</div>
			<hr />
		</div>
	</main>
</body>
</html>
<%@ include file="footer.jsp" %>