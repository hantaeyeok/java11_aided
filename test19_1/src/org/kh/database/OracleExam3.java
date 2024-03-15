package org.kh.databace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleExam3 {
//UPDATA tablename set 필드명1=값1[, 필드명2=값2, 필드명3=값3] [where 필드명=값] : 테이블 데이터에서 특정 조건 맞는 레코드의 데이터를 변경한다.
	public static void main(String[] args) {
		Connection con = null;								//데이터 베이스와의 통신을 위한 객체 연결 설정 쿼리 실행을 담당
		PreparedStatement pstmt = null;						//SQL 쿼리를 실행하고, 동적인 매개변수를 전달하는 데 사용//상태 변경(on/off) 하고, sql 문장을 시행
		ResultSet rs = null;								//sql 불른 데이터를 받는 resultSet 데이터 객체	//검색 select문 결과를 반환 받음
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";		//jdbc:oracle:thin:@호스트주소:포트번호:xe
		String userid = "system";
		String userpw = "1234";
		String sql = "update student set point=?, name=? where no=?";
		Student st = new Student(3,"유성환",98);
		int i = 0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, st.getPoint());
				pstmt.setString(2, st.getName());
				pstmt.setInt(3, st.getNo());
				i = pstmt.executeUpdate();
				if(i>0) {
					System.out.println(i+"건 정상적 처뢰됨");
				} else {
					System.out.println("spq 처리 실패");
				}
				
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는 sql 구문 처리 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("driver loding 실패");
			e.printStackTrace();
		} finally {
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

}
