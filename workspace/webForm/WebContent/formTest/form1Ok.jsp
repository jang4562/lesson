<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form1Ok.jsp</title>
</head>
<body>
<%
  String name=request.getParameter("name");
  String pwd=request.getParameter("pwd");
%>
<p><%=name %></p>
<p><%=pwd %></p>
</body>
</html>