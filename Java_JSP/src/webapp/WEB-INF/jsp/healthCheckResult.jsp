<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Health" %>>
<%
Health health = (Health)request.getAttirbute("health");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>健康診断</title>
</head>
<body>
<h1>結果</h1>
<p>
身長：<%=health.getHeight() %><br>
体重：<%=health.getWeight() %><br>
BMI：<%=health.getBmi() %><br>
体型：<%=health.getBodytype() %><br>
</p>
<a href="/Java_JSP/HealthCheck">戻る</a>
</body>
</html>