<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
	<h2>로그인</h2>
	<form method="post" action="/login"> <!--post방식은 99.99% form으로 보낸다.  -->
		id:<input type="text" name="id"><br>
		pw:<input type="password" name="password">
		   <input type="submit" value="로그인">
	</form>
</body>
</html>