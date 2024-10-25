<%@page import="com.board.db.BoardDto"%>
<%@page import="com.board.db.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String num = request.getParameter("num");
String title = request.getParameter("title");
String writer = request.getParameter("writer");
String content = request.getParameter("content");
BoardDao dao = new BoardDao();
BoardDto dto = new BoardDto(Integer.parseInt(num), writer, title, content, null, 0);
dao.updateBoard(dto);
response.sendRedirect("list");
%>    
