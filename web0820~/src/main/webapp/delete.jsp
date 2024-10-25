<%@page import="com.board.db.BoardDto"%>
<%@page import="com.board.db.BoardDao"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String num = request.getParameter("num");
BoardDao dao = new BoardDao();
dao.deleteBoard(Integer.parseInt(num));
response.sendRedirect("list");
%>    
