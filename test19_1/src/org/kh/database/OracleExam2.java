package org.kh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//sql에 데이터 집어넣기
public class OracleExam2 {
//insert into 테이블명[(필드명1, 필드면2,...)] values (값1,겂2,값3....) : 테이블에 레코드를 추가
	public static void main(String[] args) {
		Connection con = null;			//데이터 베이스와의 통신을 위한 객체 연결 설정 쿼리 실행을 담당
		PreparedStatement pstmt = null;	//SQL 쿼리를 실행하고, 동적인 매개변수를 전달하는 데 사용//상태 변경(on/off) 하고, sql 문장을 시행
		ResultSet rs = null;			//sql 불른 데이터를 받는 resultSet 데이터 객체	//검색 select문 결과를 반환 받음
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";//jdbc:oracle:thin:@호스트주소:포트번호:xe
		String userid = "system";
		String userpw = "1234";
		String sql = "insert into student values(?,?,?)";
		int i =0;
		Student st = new Student(7,"조우진",95);
		
		
		try {
			Class.forName(driver);		//드라이버 로딩
			try {
				con = DriverManager.getConnection(url, userid, userpw);		//드라이버  연결
				
				pstmt = con.prepareStatement(sql);		//전원 on
				pstmt.setInt(1, st.getNo());			//쿼리 옵션 추가
				pstmt.setString(2, st.getName());		
				pstmt.setInt(3, st.getPoint());	
				i = pstmt.executeUpdate();			//update 하고 commit 명령이 포함되어 있다. 		//여기를 왜 int 로 받느지		
				//sql 실행 및 결과 반환 : insert/updat/delte 일때는 commit이 반드시 필요함으로 executeUpdate()메소드를 사용해야 하며 결과 반화능 ㄴint다.
				if(i>0) {
					System.out.println(i+"건이 성공적으로 처리 되었습니다.");
				} else {
					System.out.println("SQL 구문 실패");
				}
			} catch (SQLException e) {
				System.out.println("데이터 베이스 연결 실패 또는 SQL 처리 실패");
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
