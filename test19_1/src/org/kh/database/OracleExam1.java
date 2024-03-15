package org.kh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleExam1 {
//select 필드명1[, 필드명2, 필드명3,....또는 *] from 테이블명[where 필드명=값] : 테이블에서 특정 조건에 만족하는 레코드를 검색
	public static void main(String[] args) {
		Connection con = null;			//데이터 베이스와의 통신을 위한 객체 연결 설정 쿼리 실행을 담당
		PreparedStatement pstmt = null;	//SQL 쿼리를 실행하고, 동적인 매개변수를 전달하는 데 사용//상태 변경(on/off) 하고, sql 문장을 시행
		ResultSet rs = null;			//sql 불른 데이터를 받는 resultSet 데이터 객체	//검색 select문 결과를 반환 받음
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";//jdbc:oracle:thin:@호스트주소:포트번호:xe
		String userid = "system";
		String userpw = "1234";
		String sql = "select * from student";
		List<Student> stList = new ArrayList<>();
		
		
		try {
			Class.forName(driver);				//현재 클래스에 드라이버 로딩
			try {
				
				con = DriverManager.getConnection(url, userid, userpw);	//Java에서 데이터베이스와의 연결을 설정하기 위해 사용되는 메서드
				pstmt = con.prepareStatement(sql);			//논리적 채널 연결
				rs = pstmt.executeQuery();		//sql 구문이 select 문장인 경우에는 commit이 필요 없으므로 executeQuery() 메소드를 사용하며, 결과 반환은 레코드 셋(ResultSet)이다.
				while(rs.next()) {	//rs = 데이터 객체 , 데이터 객체를 자바 데이터로 변환하는 과정
					Student st = new Student(rs.getInt("no"),rs.getString("name"),rs.getInt("point"));
					stList.add(st);
				}
				
				
			} catch (SQLException e) {
				System.out.println("database 연결 실패 도는 sql 구문 실행 실패");
				e.printStackTrace();
			}	
		} catch (ClassNotFoundException e) {
			System.out.println("driver loding 실패");
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println("rs.close 문제");
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
		
		for(Student s : stList) {
			System.out.println(s.toString());
		}
		
		
	}

}
