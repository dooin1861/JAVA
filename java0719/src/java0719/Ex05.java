package java0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
//		String createString = 
//		          "INSERT INTO dept VALUES "
//				+ "(10, 'ACCOUNTING', 'NEW YORK'), "
//				+ "(20, 'RESEARCH', 'DALLAS'), "
//				+ "(30, 'SALES', 'CHICAGO'), "
//				+ "(40, 'OPERATIONS', 'BOSTON')  ";
		
//		String createString = 
//				"INSERT INTO emp VALUES "
//				+ "(7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800, NULL, 20), "
//				+ "(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600, 300, 30), "
//				+ "(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30), "
//				+ "(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975, NULL, 20), "
//				+ "(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30), "
//				+ "(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850, NULL, 30), "
//				+ "(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450, NULL, 10), "
//				+ "(7788, 'SCOTT', 'ANALYST', 7566, '1982-12-09', 3000, NULL, 20), "
//				+ "(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, NULL, 10), "
//				+ "(7844, 'TURNER', 'SALESMAN', 7698, '1980-09-08', 1500, 0, 30), "
//				+ "(7876, 'ADAMS', 'CLERK', 7788, '1983-01-12', 1100, NULL, 20), "
//				+ "(7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950, NULL, 30), "
//				+ "(7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000, NULL, 20), "
//				+ "(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300, NULL, 10);";
		
	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("DEPTNO를 입력하세요: ");
		String deptno = scan.nextLine();
		System.out.print("DNAME을 입력하세요: ");
		String dname = scan.nextLine();
		System.out.print("LOC을 입력하세요: ");
		String loc = scan.nextLine();
		scan.close();
		
		String createString = 
				"INSERT INTO dept (deptno, dname, loc) VALUES (?, ?, ?)";
		
		String URL = "jdbc:mysql://localhost:3306/spring5fs";
		
		Connection con = null;
		PreparedStatement pstmt = null;

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL JDBC 데이터 로드
			
			con = DriverManager.getConnection(URL, "spring5", "spring5"); // 데이터베이스 연결
			System.out.println("Mysql 접속 성공!");
			
			pstmt = con.prepareStatement(createString); // PreparedStatement 객체 생성
			
			pstmt.setString(1, deptno); // 입력값을 쿼리에 바인딩
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			int rowsAffected = pstmt.executeUpdate();
			System.out.println("데이터 삽입 성공 " + rowsAffected);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

