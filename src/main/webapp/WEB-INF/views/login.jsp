<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>롤GO:: 로그인</title>
</head>
<body>
<h1>
	롤Go :: 로그인
</h1>

<form action="/login" method="post">
	아이디 (롤닉네임)<br><input type="text" name="memberId"><br><br>
	비밀번호<br><input type="password" name="password"><br><br>
	<input type="submit" value="로그인">
</form>
</body>
</html>
