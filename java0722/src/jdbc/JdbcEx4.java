package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEx4 {
	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		java.sql.Statement stmt = null;
		String sql = "select * from dept "
				+ "where loc = '서울'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("접속 성공");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql); // 
			
			rs.next();
			System.out.println("dept 테이블에는 총 " + rs.getInt(1)+"건의 자료가 있음.");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
