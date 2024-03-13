package org.kh.databace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleExam4 {
//delete from tablename where 필드명=값
	public static void main(String[] args) {
		Connection con = null;								//데이터 베이스와의 통신을 위한 객체 연결 설정 쿼리 실행을 담당
		PreparedStatement pstmt = null;						//SQL 쿼리를 실행하고, 동적인 매개변수를 전달하는 데 사용//상태 변경(on/off) 하고, sql 문장을 시행
		ResultSet rs = null;								//sql 불른 데이터를 받는 resultSet 데이터 객체	//검색 select문 결과를 반환 받음
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";		//jdbc:oracle:thin:@호스트주소:포트번호:xe
		String userid = "system";
		String userpw = "1234";
		String sql = "delete from student where no=?";
//		String sql = "delete from student where name=?";
//		String sql = "delete from student where point=?";
		int i = 0;
		Student st = new Student(5,"한태역1",70);
	
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
//				pstmt.setInt(1, 70);
				pstmt.setInt(1, st.getNo());
				i = pstmt.executeUpdate();
				if(i>0) {
					System.out.println(i+"정상");
				} else {
					System.out.println("비정상");
				}
			} catch (SQLException e) {
				System.out.println("드라이버 연결 실패");
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		
		}
		
	}

}
