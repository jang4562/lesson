<%@ page contentType="text/html; charset=utf-8"%>
<%!
	int pageCount = 0;
void addCount() {
	pageCount++;
}
%>
<%
	addCount();
%>
<footer class = "container">
	<%-- &copy; 는 저작권 마크 글씨코드 --%>
	<p>&copy; WebMarket, 2018.</p>
	<%=pageCount%>번째 방문
</footer>