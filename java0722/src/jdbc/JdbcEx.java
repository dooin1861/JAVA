package jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcEx {
	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		java.sql.Statement stmt = null;
		String sql = "create table dept ("
				+ "deptno int primary key, "
				+ "dname varchar(14), "
				+ "loc varchar(13))";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("접속 성공");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("쿼리 생성");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
