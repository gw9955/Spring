<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
<script type="text/javascript">
	// li하위에 ul이 있는 element 클릭시  이벤트 실행
	$(function() {
		$('li:has(ul)').click(function(event) {

			// 해당 li 밑에 ul 밑에 하위 li가 있는지 체크
			// 없으면  getSubData를 호출해서 ajax로 데이터 가져오기
			if ($(this).children("ul").children("li").size() <= 0) {

				getSubData($(this)); // 현재 객체를 전달해 나중에 그 객체 하위에 추가를 해야지
				return;
			}

			// 밑에 ul 밑에 하위 li가 존재하면

			// 숨김여부에 따라 보이고 안보이고 처리
			if ($(this).children().is(':hidden')) {

				$(this).css('list-style-image', 'url(minus.gif)') // 스타일변경(현재 이미지가 없음)
				.children().slideDown(); // 효과를 줘서 보이기
			} else {

				$(this).css('list-style-image', 'url(plus.gif)') // 스타일변경(현재 이미지가 없음)
				.children().slideUp(); // 효과를 줘서 숨기기
			}
		}).css({
			cursor : 'pointer',
			'list-style-image' : 'url(plus.gif)'
		}) // 스타일변경(현재 이미지가 없음)
		.children().hide(); // 하위를 시작하기점에 무조건 숨김처리

		// li밑에 ul이 없는경우 스타일 변경
		$('li:not(:has(ul))').css({
			cursor : 'default',
			'list-style-image' : 'none'
		});
	});

	// li하위에 ul은 존재하지만 그 밑에 li가 없을때는 ajax로 가져오자
	function getSubData($obj) {

		jQuery.ajax({
			type : 'get',
			asyn : true,
			url : 'subtree.json',
			data : "",
			dataType : "json",
			contentType : "application/x-www-form-urlencoded;charset=UTF-8",
			success : function(jsonData) {

				setSubTree($obj, jsonData);

			},
			error : function(xhr, textStatus) {
				alert(textStatus + "/" + xhr.status);
			},
			complete : function(xhr, textStatus) {

			}
		});
	}

	// ajax를 통해서 가져온 json 데이터를 해당하는 li 객체 밑에 추가를 하자
	function setSubTree($obj, jsonData) {

		$(jsonData).each(function() {

			// 하위에 들어갈 a 및 li객체를 만들어서
			$a = $("<a></a>").text(this.name).attr("href", this.url);
			$li = $("<li></li>");
			$li.append($a);

			//상위 li객체에 추가하자
			$obj.children("ul").append($li);

		});

		// 마지막으로 다시 클릭된것처럼 이벤트를 실행해서 하위를 보이도록~
		$obj.trigger("click");
	}
</script>
<style>
fieldset {
	width: 320px
}
</style>
</head>
<body>
	<fieldset>
		<legend>트리</legend>
		<form action="/tree4" method="post">
		<ul>
				<li class="globalNav">(주)대덕인재개발원
			<c:forEach var="row" items="${data}" varStatus="stat">
					<ul id="menu01_sub" class="localNav">
						<li><a href="#">${row.orgname}</a>
							<ul>
								<li><a href="#">경영관리실</a></li>
								<li><a href="#">경영전략실</a></li>
								<li><a href="#">글로벌사업실</a></li>
							</ul>
						</li>
					</ul>
			</c:forEach>
				</li>
		</ul>
		</form>
	</fieldset>
</body>
</html>