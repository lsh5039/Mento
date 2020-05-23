<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String str = (String) request.getAttribute("str");//옛날 방식이에요..set한건 무조건 get으로 받는다.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
	<h2>회원가입</h2>
	안녕하세요.
	<p><%=str %></p>
</body>
</html>