<%@page import="shop.Product"%>
<%@page import="shop.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String num = request.getParameter("num");
ProductDAO dao = new ProductDAO();
dao.deleteProduct(Integer.parseInt(num));
%>    
<jsp:forward page="products.jsp"/>