<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	request.setAttribute("name", "고양이");
	request.setAttribute("money", -5000);
	request.setAttribute("dataList", new String[] {"a", "b", "c"});
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- JSTL if -->
<c:if test="${name == '고양이' }">
		이름은 고양이. <br>
</c:if>

<c:choose>
	<c:when test = "${money >= 10000 }">
		돈 많아요
	</c:when>
	<c:when test = "${money > 0 }">
		돈 조금 있어요
	</c:when>
	<c:otherwise>
		돈 하나도 없어요
	</c:otherwise>
</c:choose>
<br><br>

<c:forEach var="cc" begin="0" end="30" step="3">
	${cc }
</c:forEach>
<br><br>

${sum = 0; ''} 
<c:forEach var="i" begin="1" end="10">
${sum = sum + i; ''} 
</c:forEach>
1부터 10까지의 합: ${sum} <br><br>

<ul>
<c:forEach var="i" begin="1" end="9">
<li> 4 X ${i} = ${4*i} <br>
</c:forEach>
</ul>

<c:forEach var="data" items="${dataList }">
	${data }
</c:forEach>

</body>
</html>