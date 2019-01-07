<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Action Tag</title>
</head>
<body>
	<h3>이 파일은 first.jsp입니다.</h3>
	<%-- 1번 주석코드 --%>
	<!-- 2번 주석코드 
	2번 주석은 텍스트만된다  코드를 주석처리하려면 1번 주석을써야함
	-->
	<%-- <jsp:forward page="second.jsp" /> --%>
	<%-- <jsp:include page="second.jsp">
		<jsp:param name="date" value ="<%=new java.util.Date()%>" />
		
	</jsp:include> --%>
	<h3>param 액션 태그</h3>
	<jsp:forward page="param01_data.jsp">
		<jsp:param name="id" value="admin" />
		<jsp:param name="name" value='<%=java.net.URLEncoder.encode("관리자")%>'/>
	</jsp:forward>
	<p>Java Server Page</p>
	
	<p>===first.jsp의 페이지=====
</body>
</html>