<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询学生</title>
</head>
<body>
	<form action="servletSelect" method="POST">
		<table>
			<tr>
				<td>请输入要查询的学生的学号:</td>
				<td><input name="ID" type="text" /></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="查询">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>