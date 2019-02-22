<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
  <style>
  #pagination {
    display : table;
    margin : 0 auto;
  }
  </style>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
<h2>전체 리스트</h2>
<c:forEach var="i" items="${list}">
  <p>아이디 : ${i.id} / 비밀번호 : ${i.pwd}</p>
</c:forEach>

<%-- 검색기 처리 시작 --%>
<form name="searchForm" method="get">
  <div class="serach_text">
    <p>
      <select name="type" size="1" class="form-control" style="display:inline-block; width:105px">
        <option value="0" <c:if test="${pageMarker.criteria.type==0}">selected</c:if>>아이디
        <option value="1" <c:if test="${pageMarker.criteria.type==1}">selected</c:if>>비밀번호
        <option value="2" <c:if test="${pageMarker.criteria.type==2}">selected</c:if>>고유번호
      </select>
      <input type="text" value="${pageMarker.criteria.search}" name="search" placeholder="Search" class="form-control" style="display:inline-block; width:400px">
      <input type="submit" value="검색" class="btn btn-success" style="padding:5px; margin:0">
    </p>
  </div>
</form>
<%-- 검색기 처리 끝 --%>

<%-- 페이징 처리 시작 --%>
<div id="pagination">
  <ul class="pagination">
    <li class="page-item <c:if test="${!(pageMaker.prev)}">disabled</c:if>">
      <a class="page-link" href="<%=request.getContextPath() %>/list?page=${pageMaker.startPage-1}">Prev</a>
    </li>
  <c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="i">
    <li class="page-item <c:if test="${pageMaker.criteria.page ==i}">active</c:if>">
      <a class="page-link" href="<%=request.getContextPath() %>/list?page=${i}"> ${i}</a>
    </li>
  </c:forEach>
    <li class="page-item <c:if test="${!(pageMaker.prev)}">disabled</c:if>">
      <a class="page-link" href="<%=request.getContextPath() %>/list?page=${pageMaker.endPage+1}">Next</a>
    </li>
  </ul>
</div>
<%-- 페이징 처리 끝 --%>
<p><a href="<%=request.getContextPath() %>/">돌아가기</a></p>
</body>
</html>