<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<% 
User registerUser = (User)session.getAttribute("registerUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザ登録</title>
</head>
<body>
<p>下記の内容を登録します</p>
<p>
ID：<%= registerUser.getId() %>>
name：<%= registerUser.getName() %>>
</p>
<a href="/Java_JSP/RegisterUser">戻る</a>
<a href="/Java_JSP/RegisterUser?action=done">登録</a>
</body>
</html>