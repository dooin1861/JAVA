<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 정보 수정</title>
</head>
<body>

<%
    request.setCharacterEncoding("utf-8");
	
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try ( 
            Connection conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
            Statement stmt = conn.createStatement();
                
            // 현재 로그인한 사용자 정보를 읽어옴
            ResultSet rs = stmt.executeQuery(String.format(         
                    "select * from member where id='%s'", 
                    (String)session.getAttribute("userId")));
             
    ) {
    
        rs.next();
%>
        <form action="member_update.jsp" method="post">
            <table>
                <tr>
                    <td>회원ID</td>
                    <td><input type="text" name="id" readonly
                               value="<%=rs.getString("id")%>"></td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td><input type="password" name="pw" 
                               value="<%=rs.getString("pw")%>"></td>
                </tr>
                <tr>
                    <td>회원명</td>
                    <td><input type="text" name="name" 
                               value="<%=rs.getString("name")%>"></td>
                </tr>
            </table>    
            <input type="submit" value="저장"> 
        </form>
<%       
    } catch(Exception e) {
        e.printStackTrace();
    }
%>
    
</body>
</html>