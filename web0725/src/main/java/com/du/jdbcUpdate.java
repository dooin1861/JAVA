package com.du;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class jdbcUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public jdbcUpdate() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loc1 = (request.getParameter("loc"));
		String deptno = (request.getParameter("deptno"));
		String dname = (request.getParameter("dname"));
		System.out.println(loc1);
		System.out.println(deptno);
		System.out.println(dname);
		
		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();
		out.println("<h1> 서블릿 페이지 </h><br>");
		
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update dept set dname = ?, loc = ?, deptno = ? where deptno = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩!");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("Mysql 접속 성공!");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(2, loc1);
			pstmt.setString(3, deptno);
			pstmt.setString(1, dname);
			
			
			int ret = pstmt.executeUpdate();
			System.out.println(ret + "건 update 성공!");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
