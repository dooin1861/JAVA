<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%

	String email = request.getParameter("email");
	response.addCookie(Cookies.createCookie("email", email, "/", -1)); // 쿠키 생성, -1은 브라우저를 닫으면 쿠키X
	response.sendRedirect("saveEmail.jsp");
%>
    
