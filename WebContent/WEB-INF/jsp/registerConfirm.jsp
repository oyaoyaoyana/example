<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.User"%>
<%
  User user = (User) session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
ログインID：<%= user.getId() %><br>
名前：<%= user.getName() %><br>
<a href="/example/RegistUser?action=done">登録</a>
</body>
</html>