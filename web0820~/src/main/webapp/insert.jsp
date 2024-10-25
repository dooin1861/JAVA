<%@page import="com.board.db.BoardDto"%>
<%@page import="com.board.db.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

String title = request.getParameter("title");
String writer = request.getParameter("writer");
String content = request.getParameter("content");
BoardDao dao = new BoardDao();
BoardDto dto = new BoardDto(0, writer, title, content, null, 0);
dao.insertBoard(dto);
response.sendRedirect("list");
%>    
