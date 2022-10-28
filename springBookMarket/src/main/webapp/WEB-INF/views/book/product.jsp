<%@ page  contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" 
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>도서 목록</title>
</head>
<body>
<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<!-- 내용 들어온다 -->
		<div class="container">
			<h1 class="display-3">도서 목록</h1>
		</div>
	</div>
	<!--============= 도서 목록 시작 ================-->
		<div class="container">
		<div class="row" align="left">
		<div class="col-md-5">
            <img src="/resources/images/${bookVO.filename}" style="width:100%"/>
         </div>
				<div class="col-md-6">
					<h3>${bookVO.category}${bookVO.name}</h3>
					<p>${bookVO.description}</p>
					<p>
						<b>도서 코드 : </b>
						<span class = "badge badge-danger">${bookVO.bookId}</span>
					</p>
					<p><b>출판사  </b> : ${bookVO.publisher}</p>
					<p><b>저자  </b> : ${bookVO.author}</p>
					<p><b>재고수  </b> : ${bookVO.unitsInstock}</p>
					<p><b>총 페이지수 </b> : ${bookVO.totalPages}</p>
					<p><b>출판일  </b> : ${bookVO.releaseDate}</p>
					<h4>${bookVO.unitPrice}원</h4>
					<p>
						<a href="#" class="btn btn-info">상품주문&raquo;</a>
						<a href="/products" class="btn btn-secondary">상품 목록&raquo;</a>
				</p>
				</div>
		</div>
	</div>
	
	<!--============= 도서 목록 끝==================-->
	<jsp:include page="footer.jsp" />
</body>
</html>