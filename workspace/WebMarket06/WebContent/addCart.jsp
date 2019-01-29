<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.sql.*"%>
<%@ page import="dto.Product" %>
<%@ include file="dbconn.jsp"%>
<%
	String id = request.getParameter("id");
	if (id == null || id.trim().equals("")) {
		response.sendRedirect("products.jsp");
		return;
	}

	PreparedStatement pstmt = null;	
	ResultSet rs = null;

	Product product = new Product();
	
	String sql = "select * from product where p_id = ?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id);
	rs = pstmt.executeQuery();
	
	while (rs.next()) {
		product.setCategory(rs.getString("p_category"));
		product.setCondition(rs.getString("p_condition"));
		product.setDescription(rs.getString("p_description"));
		product.setFilename(rs.getString("p_fileName"));
		product.setManufacturer(rs.getString("p_manufacturer"));
		product.setPname(rs.getString("p_name"));
		product.setProductId(rs.getString("p_id"));
		product.setUnitPrice(rs.getInt("p_unitPrice"));
		product.setUnitsInStock(rs.getInt("p_unitsInStock"));
	}

	
	ArrayList<Product> list = (ArrayList<Product>) session.getAttribute("cartlist");
	if (list == null) { 
		list = new ArrayList<Product>();
		session.setAttribute("cartlist", list);
	}

	int cnt = 0;
	Product goodsQnt = new Product();
	for (int i = 0; i < list.size(); i++) {
		goodsQnt = list.get(i);
		if (goodsQnt.getProductId().equals(id)) {
			cnt++;
			int orderQuantity = goodsQnt.getQuantity() + 1;
			goodsQnt.setQuantity(orderQuantity);
		}
	}

	if (cnt == 0) { 
		product.setQuantity(1);
		list.add(product);
	}

	response.sendRedirect("product.jsp?id=" + id);
%>