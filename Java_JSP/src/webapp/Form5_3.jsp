<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザの登録</title>
</head>
<body>
<form action="/Java_JSP/FormServlet5_3" method="post">
名前:<br>
<input type="text" name="name"><br>
<br>性別:<br>
男<input type="radio" name="gender" value="0">
女<input type="radio" name="gender" value="1">
<input type="submit" value="登録">
</form>
</body>
</html>