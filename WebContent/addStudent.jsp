<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加学生</title>
</head>
<body>
	<form action="servletInsert" method="POST">
		<table>
			<tr>
				<td>ID:</td>
				<td><input name="ID1" type="text" /></td>
				<td>姓名:</td>
				<td><input name="name1" type="text" /></td>
				<td>年龄:</td>
				<td><input name="age1" type="text" /></td>
			</tr>
			<tr>
				<td>ID:</td>
				<td><input name="ID2" type="text" /></td>
				<td>姓名:</td>
				<td><input name="name2" type="text" /></td>
				<td>年龄:</td>
				<td><input name="age2" type="text" /></td>
			</tr>
			<tr>
				<td>ID:</td>
				<td><input name="ID3" type="text" /></td>
				<td>姓名:</td>
				<td><input name="name3" type="text" /></td>
				<td>年龄:</td>
				<td><input name="age3" type="text" /></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="添加">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>