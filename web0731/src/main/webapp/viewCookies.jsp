<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 목록</title>
</head>
<body>
<%
Cookie[] cookies = request.getCookies();
if (cookies != null && cookies.length > 0) { // 쿠키가 널이 아니고 크기가 0이 아니면
	for (int i=0; i < cookies.length; i++) {
		out.println(cookies[i].getName() + "=");
		out.println(cookies[i].getValue());
	}
}

%>
</body>
</html>