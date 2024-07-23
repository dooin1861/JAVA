package java0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex07 {
	
	public static void main(String[] args) {
		String createString = "delete from dept; ";
//				+ "where customer_id LIKE 'C%' ";
		
		String URL = "jdbc:mysql://localhost:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "spring5", "spring5"); // 데이터베이스에 연결. 순서대로 아이디, 비밀번호
			System.out.println("Mysql 접속 성공!"); 
			stmt = con.createStatement();
			int num = stmt.executeUpdate(createString);
			System.out.println("테이블 안의 행 삭제! "+ num);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace(); // 드라이버 클래스를 찾을 수 없거나 SQL 작업 중에 오류가 나면 오류 메시지 출력
		}
	}
}

