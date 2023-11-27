<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/extras/spring-security">
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
</style>
</head>
<body>
	<h3>db연결 테스트 페이지</h3>
	<a href="./">테스트</a>
	<form class="test_write" action="test_write" "method="POST">
	<table class="table table-hover">
		<tr><td><hr></td></tr>
		<thead>
			<tr>
				<td><input type="text" name="test_title" placeholder="제목을 입력해주세요." required></td>
			</tr>
			<tr>
				<td><textarea rows="15" name="test_contents" cols="100" placeholder="내용을 입력해주세요."></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="글작성" ></td>
			</tr>
		</thead>
	</table>
	</form>
</body>
</html>