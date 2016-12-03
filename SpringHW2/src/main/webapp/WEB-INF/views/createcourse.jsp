<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/main.css"
	type="text/css" media="screen">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="get" action="${pageContext.request.contextPath}/docreate">
		<table>
			<tr>
				<td class="label">년도 :</td>
				<td><input name="year" type="number" /></td>
			</tr>
			<tr>
				<td class="label">교과명 :</td>
				<td><input name="name" type="text" /></td>
			</tr>
			<tr>
				<td class="label">학기 :</td>
				<td><input name="semester" type="text" /></td>
			</tr>
			<tr>
				<td class="label">과목코드 :</td>
				<td><input name="code" type="text" /></td>
			</tr>
			<tr>
				<td class="label">이수구분 :</td>
				<td><input name="value" type="text" /></td>
			</tr>
			<tr>
				<td class="label">학점 :</td>
				<td><input name="grades" type="number" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input value="Create offer" type="submit" /></td>
			</tr>
		</table>
	</form>

</body>
</html>