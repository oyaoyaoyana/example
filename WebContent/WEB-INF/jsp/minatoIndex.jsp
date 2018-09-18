<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.SiteEV"%>
<%
SiteEV site = (SiteEV) application.getAttribute("siteEV");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>minatoくんのページ</title>
</head>
<body>
<h1>ミナトのページ</h1>
<a href="/example/MinatoIndex?action=like">よいね</a>：<%= site.getGood()%><br>
<a href="/example/MinatoIndex?action=dislike">よくないね</a>：<%= site.getBad() %><br>
</body>
</html>