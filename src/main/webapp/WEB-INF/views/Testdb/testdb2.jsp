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
	<h3>화면 이동 성공</h3>
	<a href="testdb"><button>전화면</button></a>
	<a href="./"><button>메인화면</button></a>
</body>
</html>