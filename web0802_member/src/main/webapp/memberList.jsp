<%@page import="java.util.List"%>
<%@page import="member.MemberDAO"%>
<%@page import="member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    MemberDAO dao = new MemberDAO();
    List<MemberDTO> list = dao.getMemberList();
    String id = request.getParameter("id");
    %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 리스트</title>

<head>
    <meta charset="UTF-8">
    <style>
        table     { width:500px; text-align:center; }
        th        { background-color:cyan; }
        
        .id      { width:150px; }
        .name    { width:100px; }
        .pw      { width:150px; }
        
                
        a:link    { text-decoration:none; color:blue; }
        a:visited { text-decoration:none; color:gray; }
        a:hover   { text-decoration:none; color:red;  }
    </style>
</head>
</head>
<body>

<table>

	<tr>
        <th class="name"    >이름    </th>
        <th class="id"     >id    </th>
        <th class="pw"    >비밀번호  </th>
        <th class="update">수정  </th>
        
    </tr>
<%
for (MemberDTO dto : list) {
%>
    <tr>
        <td><%=dto.getId() %></td>
        <td><%=dto.getName() %></td>
        <td><%=dto.getPw() %></td>
        <td><button onclick="location.href='?member_update=<%=id%>' "> 수정 </button></td>
       
    </tr>
<%
}
%>
    
</table>
<br>
<input type="button" value="메인으로 돌아가기" onclick="location.href='login_main.jsp'">

</body>
</html>