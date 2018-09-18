<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import "model.*"%>
<%
  Employee emp = new Employee("0001", "hoge");
  String id = emp.getId();
	String name = emp.getName();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% for(int i; i < 10; i++) {%>
	<% if (i % 3 == 0)  { %>
	<p style="color=red">
	<% } else { %>
	<p>
	<% } %>
	IDは<%= id %>で、名前は、<%= name %>です。</p>
<% } %>
</body>
</html> --%>