<%@page import="board.BoardDTO"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num = request.getParameter("num");
BoardDAO dao = new BoardDAO();
dao.increaseHits(Integer.parseInt(num));
BoardDTO dto = dao.getOne(Integer.parseInt(num));
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        td    { text-align:left; border:1px solid gray; }
    </style>
</head>
<body>

<table>
<c:forEach var="dto" items="${dto}">
    <tr>
        <th>제목</th>
        <td>${dto.title}</td>
    </tr>
    <tr>
        <th>작성자</th>
        <td>${dto.writer}</td>
    </tr>
    <tr>
        <th>작성일시</th>
        <td>${dto.regtime}</td>
    </tr>
    <tr>
        <th>조회수</th>
        <td>${dto.hits}</td>
    </tr>
    <tr>
        <th>내용</th>
        <td>${dto.content}</td>
    </tr>
</c:forEach>
</table>

<br>
<input type="button" value="목록보기" onclick="location.href='list.jsp'">
<input type="button" value="수정"
       onclick="location.href='write2.jsp?num=<%=dto.getNum()%>'">
<input type="button" value="삭제"
       onclick="location.href='delete.jsp?num=<%=dto.getNum()%>'">

</body>
</html>