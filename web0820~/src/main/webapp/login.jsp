<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   

<%
	request.setCharacterEncoding("utf-8");
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try ( 
        Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
        Statement stmt = conn.createStatement();
            
            // 지정된 아이디와 비밀번호를 가진 레코드가 있는지 쿼리 
        ResultSet rs = stmt.executeQuery(String.format(         
                "select * from member where id='%s' and pw='%s'",
                request.getParameter("id"), request.getParameter("pw")));
    ) {
        // 그런 레코드가 있으면, 세션 속성을 등록하고, 메인 화면으로 돌아감
        if (rs.next()) {
            session.setAttribute("userId",   rs.getString("id"  ));
            session.setAttribute("userName", rs.getString("name"));
                
            response.sendRedirect("login_main.jsp");   
            return;
        }
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<script>
    alert('아이디 또는 비밀번호가 틀립니다!');
    history.back();
</script>
 
</body>
</html>
