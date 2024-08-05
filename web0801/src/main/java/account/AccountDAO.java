package account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;


public class AccountDAO {
	// JDBC 관련 변수 
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	private String ACC_LIST = "select * from account";
	private String ACC_ONE = "select * from account where num = ?";
	private String ACC_INSERT = "insert into account(name, ssn, tel) values(?,?,?)";
	private String ACC_COUNT = "select count(*) as cnt from account where name = ? and ssn = ?"; // as "ABC" 컬럼명을 따로 지정가능

	// 로그인 확인
	public boolean checkLogin(String name, String ssn) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(ACC_COUNT);
			stmt.setString(1, name);
			stmt.setString(2, ssn);
			rs = stmt.executeQuery();
			rs.next();
			
			if (rs.getInt("cnt") == 1) { // 지정한 컬럼명
				return true;  // 로그인 성공
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return false; // 로그인 실패
	}
	
	// 게시판 등록
	public void insertBoard(AccountDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(ACC_INSERT);
			stmt.setString(1, dto.getName());
			stmt.setString(2, dto.getSsn());
			stmt.setString(3, dto.getTel());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}
	
//	public BoardDTO getOne(int num) {
//		BoardDTO dto = null;
//		conn = JDBCUtil.getConnection();
//		try {
//			stmt = conn.prepareStatement(BOARD_ONE);
//			stmt.setInt(1, num);
//			rs = stmt.executeQuery();
//			if (rs.next()) {
//				dto = new BoardDTO(rs.getInt("num"), rs.getString("writer"),
//						rs.getString("title"), rs.getString("content"),
//						rs.getString("regtime"), rs.getInt("hits"));
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} finally {
//				JDBCUtil.close(rs, stmt, conn);
//			}
//			return dto;
//		}
}
