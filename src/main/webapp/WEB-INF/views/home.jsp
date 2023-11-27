<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>Home</title>
</head>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
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
  th, td {
    border: 1px solid #444444;
    padding: 10px;
    text-align: center;
     width : 100px;
  }
</style>
</head>
<body>
	<h3><a href="./">게시판</a></h3>
	<a href="testdb">글작성 테스트</a>
	<section>
		<!-- 상품 리스트 -->
		<div>
		테스트!!
		</div>
		<div style="width: 500px; height: auto; border: 1px solid red; ">
			<c:forEach var="test" items="${post_list}">
				<table>
				<tr>
				<td>${test.test_code}</td>
				<td><a href='test_read_page?test_code=${test.test_code}'>${test.test_title}</a></td>
				<td>${test.test_contents}</td>
								</tr>
				</table>
			</c:forEach>
		</div>
		<div>${Paging}</div>
	</section>
</body>
</html>