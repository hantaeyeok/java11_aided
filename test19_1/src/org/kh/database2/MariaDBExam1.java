package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.kh.database.Student;

public class MariaDBExam1 {
	public static void main(String[] args) {
		Connection con = null;			//데이터 베이스와의 통신을 위한 객체 연결 설정 쿼리 실행을 담당
		PreparedStatement pstmt = null;	//SQL 쿼리를 실행하고, 동적인 매개변수를 전달하는 데 사용//상태 변경(on/off) 하고, sql 문장을 시행
		ResultSet rs = null;			//sql 불른 데이터를 받는 resultSet 데이터 객체	//검색 select문 결과를 반환 받음
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";//jdbc:oracle:thin:@호스트주소:포트번호:xe
		String userid = "root";
		String userpw = "1234";
		String sql = "select * from student";
		List<Student> stList= new ArrayList<>();
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Student st = new Student(rs.getInt("no"),rs.getString("name"),rs.getInt("point"));
					stList.add(st);
				}
				
			} catch (SQLException e) {
				System.out.println("데이터 베이스 연결 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
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
		for(Student s : stList) {
			System.out.println(s.toString());
		}

	}

}
