<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<head>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<title>게시판</title>
<style>
body {
	width: 1000px;
	height: 1000px;
	padding: 3%;
	margin-left: 13%;
}

.test {
	float: right;
}

.contents_title {
	height: 50px;
	border-bottom: 1px solid black;
	background-color: aqua;
}
.contents_code {
	height: 50px;
	border-bottom: 1px solid black;
	background-color: gray;
}

</style>
</head>
<body>
	<h3>글 읽기 페이지</h3>
	<a href="./">메인화면</a>
	<div>
		<c:forEach var="test" items="${post_list}">
			<table class="table table-hover"
				style="border: 1px solid black; width: 400px; height: 500px;">
				<tr>
					<td class="contents_code" style="width: 50px;" >글번호</td>
					<td class="contents_code">${test.test_code}</td>
				</tr>
				<tr>
					<td class="contents_title">글제목</td>
					<td class="contents_title">${test.test_title}</td>
				</tr>
				<tr style="height: 80%;">
					<td class="contents_contents">글내용</td>
					<td class="contents_contents" style="float: left;">${test.test_contents}</td>
				</tr>
			</table>
	<button onclick="location.href='test_update_page?test_code=${test.test_code}'">글수정</button>
	<a href="test_delete?test_code=${test.test_code}" role="button"><button>글삭제</button></a>
		</c:forEach>
	</div>
	
</body>
</html>