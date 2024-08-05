<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int gugu = Integer.parseInt(request.getParameter("gugu"));
%>
<html>
<head>
<meta charset="UTF-8">
<title><%=gugu %> 단</title>
</head>
<body>
<table border= "1">
<tr><th><%= gugu %> 단</th></tr>
<%
	for (int i=1; i <= 9; i++) {
%>
		<tr><td><%= gugu %> X <%=i %> = <%=i*gugu %> <br></td></tr>
<%
}
%>
</table>
</body>
</html>