<!-- second.jsp -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Action Tag</title>
</head>
<body>
	
	<%-- <h3>이 파일은 second.jsp입니다.</h3> --%>
	Today is : <%=request.getParameter("date")%>
	
	<%-- <p>=== second.jsp의 페이지===== --%>
</body>
</html>