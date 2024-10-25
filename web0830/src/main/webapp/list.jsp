<%@page import="java.sql.ResultSet"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");

request.setCharacterEncoding("UTF-8");


%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table     { width:680px; text-align:center; }
        th        { background-color:cyan; }
        
        .num      { width: 80px; }
        .title    { width:230px; }
        .writer   { width:100px; }
        .regtime  { width:180px; }
                
        a:link    { text-decoration:none; color:blue; }
        a:visited { text-decoration:none; color:gray; }
        a:hover   { text-decoration:none; color:red;  }
    </style>
    <title> Word </title>
</head>
<body>
<table>
    <tr>
        <th>사번</th><th>이름</th><th>직업</th>
        <th>직급</th><th>입사일</th><th>Comm</th>
        <th>Deptno</th>

	</tr>
    
<%
String sql = "select * from emp";
pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();

while(rs.next()) {
	int empno = rs.getInt("empno");
	String ename = rs.getString("ename");
	String job = rs.getString("job");
	String mgr = rs.getString("mgr");
	String hiredate = rs.getString("hiredate");
	String comm = rs.getString("comm");
	int deptno = rs.getInt("deptno");
	
%>

	<tr>
	<td><%=empno %></td>
	<td><%=ename %></td>
	<td><%=job %></td>
	<td><%=mgr %></td>
	<td><%=hiredate %></td>
	<td><%=comm %></td>
	<th><%=deptno %></th>
	
	</tr>
	
<%
}
%>

</table>

	<br>
	<input type="button" value="insert" onclick="location.href='insert.jsp'">
	
</body>
</html>