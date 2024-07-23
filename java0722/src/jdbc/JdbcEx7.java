package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
	
		System.out.print("부서 번호: ");
		String strNo = scan.nextLine();
		System.out.print("부서명: ");
		String strName = scan.nextLine();
		System.out.print("지역 입력: ");
		String strLoc = scan.nextLine();
		String str = scan.nextLine();
		String sql = String.format("insert into dept(deptno, dname, loc) values (%s, '%s', '%s')",
				 strNo, strName, strLoc);

		System.out.println(sql);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("접속 성공");
			stmt = conn.createStatement();
			int res = stmt.executeUpdate(sql);
			System.out.println(res + "건을 입력");
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
