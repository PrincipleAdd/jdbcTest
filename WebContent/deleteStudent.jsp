<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>删除学生</title>
</head>
<body>
	<form action="servletDelect" method="POST">
		<table>
			<tr>
				<td>请输入要删除的学生的姓名:</td>
				<td><input name="name" type="text" /></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="删除">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>