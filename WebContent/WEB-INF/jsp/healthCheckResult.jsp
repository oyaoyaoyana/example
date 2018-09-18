<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Health" %>
<%
	Health health = (Health) request.getAttribute("health");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>スッキリ健康診断</h1>
身長：<%= health.getHeight() %><br>
体重：<%= health.getWeight() %><br>
BMI：<%= health.getBmi() %><br>
体型：<%= health.getBodyType() %><br>
<a href="/example/HealthCheck">戻る</a>
</body>
</html>