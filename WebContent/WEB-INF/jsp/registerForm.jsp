<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
<form action="/example/RegistUser" method="post">
ログインID：<br>
<input type="text" name="id"><br>
パスワード：<br>
<input type="password" name="pass"><br>
名前：<br>
<input type="text" name="name"><br>
<input type="submit" value="登録">
</form>
</body>
</html>