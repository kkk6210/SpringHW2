<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/main.css"
	type="text/css" media="screen">
</head>
<body>
	<table>
		<tr>
			<th>1292071 컴퓨터공학과 송용주</th>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/courses"> 모든
					교과목 조회</a></td>
		</tr>
		<tr>
			<td><a
				href="${pageContext.request.contextPath}//semester_grades"> 학기 별
					이수 학점 조회</a></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/value_grades">
					이수 구분 별 학점 조회</a></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/createcourse">
					수강신청하기</a></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath}/lookupcourse">
					수강신청조회</a></td>
		</tr>
	</table>
</body>
</html>
