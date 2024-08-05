<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 찾기 </title>
</head>
<body>
<%
String username = "";
Cookie[] cookies = request.getCookies();  // 
if (cookies != null && cookies.length > 0) { // 쿠키가 널이 아니고 크기가 0이 아니면
	for (int i=0; i < cookies.length; i++) {
		if(cookies[i].getName().equals("username")) {
			username = cookies[i].getValue();
			break;
		}
	}
}

%>

username은 <%=username %>입니다.
</body>
</html>