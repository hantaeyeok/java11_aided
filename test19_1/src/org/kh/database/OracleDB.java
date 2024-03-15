package org.kh.databace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleDB {
	Connection con = null;			//데이터 베이스와의 통신을 위한 객체 연결 설정 쿼리 실행을 담당
	PreparedStatement pstmt = null;	//SQL 쿼리를 실행하고, 동적인 매개변수를 전달하는 데 사용//상태 변경(on/off) 하고, sql 문장을 시행
	ResultSet rs = null;			//sql 불른 데이터를 받는 resultSet 데이터 객체	//검색 select문 결과를 반환 받음
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";//jdbc:oracle:thin:@호스트주소:포트번호:xe
	String userid = "system";
	String userpw = "1234";
	String sql = "select * from student";
	List<Student> stList = new ArrayList<>();
	
	public Connection connect() {
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는 sql처리 실패");
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
		
		return con;
	}
	
	public void close(PreparedStatement pstmt, Connection con){
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void close(ResultSet rs, PreparedStatement pstmt, Connection con){
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
