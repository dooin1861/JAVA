<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String str = request.getParameter("loc");
if ("".equals(str)) {
	str = "%";
}
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");
String sql = "select * from dept where loc like ?";
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, str);
ResultSet rs = pstmt.executeQuery();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
지역 <input type= "text" name= "loc">
<input type= "submit"> </p>
</form>
<table border= "1">
<%
	while(rs.next()) {
		String deptno1 = rs.getString("deptno");
		String dname1 = rs.getString("dname");
		String loc1	= rs.getString("loc");
%>
	<tr>
		<td><%=deptno1 %></td>
		<td><%=dname1 %> </td>
		<td><%=loc1 %> </td>
	</tr>
<%
	}
%>

</table>
</body>
</html>