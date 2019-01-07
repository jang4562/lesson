<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action</title>
</head>
<body>

	<jsp:useBean id="person" class="Lecture20190107.Person" scope="request" />
	
	<p> getProperty예제
	<p> 아이디 : <jsp:getProperty property="id" name="person" />
	<p> 이 름 : <jsp:getProperty property="name" name="person" />
	
	<jsp:setProperty property="id" name="person" value="20182005"/>
	<jsp:setProperty property="name" name="person" value="홍길동"/>
	<p> 아이디 : <% out.println(person.getId()); %>
	<p> 이 름 : <% out.println(person.getName()); %>
	
	<p> setProperty 후, getProperty예제
	<p> 아이디 : <jsp:getProperty property="id" name="person" />
	<p> 이 름 : <jsp:getProperty property="name" name="person" />
</body>
</html>