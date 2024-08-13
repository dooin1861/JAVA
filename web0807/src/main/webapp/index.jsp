<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
session.setAttribute("vv", "고양이");
String ss = (String)session.getAttribute("vv");
request.setAttribute("kk", "햄스터");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${vv} <br>
${1+100 }
${303 }
${vv == '고양이' } <br>
<%=ss %><br>
${kk }
</body>
</html>