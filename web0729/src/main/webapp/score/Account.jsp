<%@page import="java.sql.ResultSet"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
// 데이터베이스 접속 코드
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");

// 임시 저장 변수들
String idTmp = "";
String nameTmp = "";
String ssnTmp = "";
String telTmp = "";
int balanceTmp = 0;
String sqlTmp ="";

// 매개 변수들
request.setCharacterEncoding("UTF-8");               // 한글 깨짐 방지
String find = request.getParameter("find");          // update하기 전 학번을 클릭하면 넘어오는 매개변수
String delete = request.getParameter("delete");   // delete하기 전에 넘어오는 매개변수
String id = request.getParameter("id");            // null이면 insert, update를 하지 말아야함
String name = request.getParameter("name");
String ssn = request.getParameter("ssn");
String tel = request.getParameter("tel");
String balance = request.getParameter("balance");

if (find != null) {  // update하기 전 학번을 클릭하면
	sqlTmp = "select * from account where id = ?";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1, find);
	ResultSet rs = pstmt.executeQuery();
	if (rs.next()) {
		idTmp = rs.getString("id");
		nameTmp = rs.getString("name");
		ssnTmp = rs.getString("ssn");
		telTmp = rs.getString("tel");
		balanceTmp = rs.getInt("balance");
	}
}

if (delete != null) {
	sqlTmp = "delete from account where id = ?";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1, delete);
	int ret = pstmt.executeUpdate();
}

// 학번이 null이 아니면 이미 입력된 학번인지 조회
if (id != null) {
	sqlTmp = "select count(*) from account where id = ?";  // 이미 있는 학번 조회 (있으면 1, 없으면 0을 가져옴)
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1, id);
	ResultSet rs = pstmt.executeQuery();
	rs.next();
	int cnt = rs.getInt(1);  // 0: insert, 1: update
	if (cnt == 1) { // 정보 수정
		sqlTmp = "update account set name = ?, ssn = ?, tel = ?, balance = ? where id = ?";
		pstmt = conn.prepareStatement(sqlTmp);
		pstmt.setString(1, name);
		pstmt.setString(2, ssn);
		pstmt.setString(3, tel);
		pstmt.setString(4, balance);
		pstmt.setString(5, id);
		int ret = pstmt.executeUpdate();
	} else { //정보 입력
		sqlTmp = "insert into account(id, name, ssn, tel, balance) values (?,?,?,?,?)";  // insert
		pstmt = conn.prepareStatement(sqlTmp);
		pstmt.setString(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, ssn);
		pstmt.setString(4, tel);
		pstmt.setString(5, balance);
		int ret = pstmt.executeUpdate();
	}
}

%>





<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <style>
        table { width: 800px; text-align: left; }
        th    { width: 40px; background-color: cyan; }
    </style>
<title>Account</title>
</head>
<body>
<form>
	계정: <input type="text" name="id" value="<%=idTmp %>"><br>
	이름: <input type="text" name="name" value="<%=nameTmp %>"><br>
    SSN: <input type="text" name="ssn" value="<%=ssnTmp %>"><br>
    번호: <input type="text" name="tel" value="<%=telTmp %>"><br>
    잔고: <input type="text" name="balance" value="<%=balanceTmp %>"><br>
    <input type="submit" value="입력/수정">
</form>
<table>
<tr>
        <th>계정</th><th>이름</th>
        <th>SSN</th><th>전화번호</th><th>잔고</th>
        <th>삭제</th>
</tr>

<%
sqlTmp = "select * from account";
pstmt = conn.prepareStatement(sqlTmp);
ResultSet rs = pstmt.executeQuery();

while(rs.next()) {
	idTmp = rs.getString("id");
	nameTmp = rs.getString("name");
 	ssnTmp = rs.getString("ssn");
	telTmp = rs.getString("tel");
	balanceTmp = rs.getInt("balance");
//	int tot = Integer.parseInt(korTmp)+Integer.parseInt(engTmp)+Integer.parseInt(mathTmp);
//	DecimalFormat df = new DecimalFormat("#.##"); // 소수점 2자리만 출력
//	double avg = tot / 3.0;
%>
	
	<tr>
	<td><a href="?find=<%=idTmp %>"><%=idTmp %></a></td>
	<td><%=nameTmp %></td>
	<td><%=ssnTmp %></td>
	<td><%=telTmp %></td>
	<td><%=balanceTmp %></td>
	<td><button onclick="location.href='?delete=<%=idTmp%>' "> 삭제 </button></td>
	</tr>

<%
}
%>

</table>
</body>
</html>