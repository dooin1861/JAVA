<%@page import="java.sql.ResultSet"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("UTF-8");
String empno = request.getParameter("empno");
String ename = request.getParameter("ename");
String job = request.getParameter("job");
String writer = request.getParameter("writer");
String title = request.getParameter("title");
String content = request.getParameter("content");

//데이터베이스 접속 코드
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");

String sql = "insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) values (?,?,?,?now(),0,0,?)";
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, empno);
pstmt.setString(2, title);
pstmt.setString(3, content);
pstmt.executeUpdate();
response.sendRedirect("list.jsp"); // 리다이렉트
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert</title>
</head>
<body>
<h1> 입력 성공 </h1>
</body>
</html>