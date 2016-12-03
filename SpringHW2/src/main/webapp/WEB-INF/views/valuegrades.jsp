<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/main.css"
	type="text/css" media="screen">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>교필</th>
			<th>핵교</th>
			<th>전지</th>
			<th>전기</th>
			<th>전선</th>
			<th>일선</th>
			<th>총학점</th>

		</tr>
		<tr>
			<td>${GyoPill}</td>
			<td>${Hack}</td>
			<td>${Gunji}</td>
			<td>${Gungi}</td>
			<td>${Gunsun}</td>
			<td>${Ilsun}</td>
			<td>${allSumValue}</td>
		</tr>

	</table>

</body>
</html>