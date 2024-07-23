package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Ex06 {
	
	public static void main(String[] args) {
		String sql = "select * from dept";
				
		String URL = "jdbc:mysql://localhost:3307/dept";
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("Mysql 접속 성공!\n");
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
//				System.out.print(rs.getString("customer_id") + ", "); // 칼럼명 지정으로 검색 가능
//				System.out.println(rs.getString("customer_name"));
			
				// emp
//				System.out.print(rs.getString(1) + ", "); // 칼럼명 대신 칼럼 순번으로 검색 가능
//				System.out.print(rs.getString(2) + ", ");
//				System.out.print(rs.getString(3) + ", ");
//				System.out.print(rs.getString(4) + ", ");
//				System.out.print(rs.getString(5) + ", ");
//				System.out.print(rs.getString(6) + ", ");
//				System.out.print(rs.getString(7) + ", ");
//				System.out.println(rs.getString(8) + ", ");
				
				// dept
				System.out.print(rs.getString(1) + ", ");
				System.out.print(rs.getString(2) + ", ");
				System.out.println(rs.getString(3) + ", ");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

