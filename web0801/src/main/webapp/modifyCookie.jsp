<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 변경 </title>
</head>
<body>
<%
Cookie[] cookies = request.getCookies();  // 
if (cookies != null && cookies.length > 0) { // 쿠키가 널이 아니고 크기가 0이 아니면
	for (int i=0; i < cookies.length; i++) {
		if(cookies[i].getName().equals("loginid")) {
			Cookie cookie = new Cookie("loginid", "ABCck");  // 쿠키의 키 값을 같게 하면 변경 가능
			response.addCookie(cookie);  // 이 코드가 수행되어야 서버에 쿠키가 넘어감
		}
	}
}

%>

loginid 쿠키 변경
</body>
</html>