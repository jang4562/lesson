<html>
<head>
	<title>Welcome to JSP</title>
</head>
<body>
	<h1>Hello JSP</h1>
	Hello! Java server Pages.
	<br>
	<%!	// 변수 및 메소드 선언과 정의
		int count = 3;
	
		String makeItLower(String data){
			return data.toLowerCase();
		}
	%>
	<%
		for(int i = 1; i <= count ; i++){
			out.println("Java Server Page " + i + ".<br>");
		}
	%>
	<%=
		makeItLower("Hello Java server Pages.")
	%>
</body>
</html>