package org.kh.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleExam5 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;	//null 아니면 닫으려고 null 초기화
		String sql = "select * from student";
		OracleDB oracle = new OracleDB();
		List<Student> stList = new ArrayList<>();
		int i = 0;
//select
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Student st = new Student(rs.getInt("no"),rs.getString("name"),rs.getInt("point"));
				stList.add(st);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			oracle.close(rs, pstmt, con);
		}
		
		for(Student s : stList) {
			System.out.println(s.toString());
		}
//insert		
		con = null;
		pstmt = null;
		Student std = new Student(8, "배곤희",95);
		sql = "insert into student(name, no, point) values(?,?,?)";
		
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, std.getName());
			pstmt.setInt(2, std.getNo());
			pstmt.setInt(3, std.getPoint());
			i = pstmt.executeUpdate();
			if(i>0) {
				System.out.println(i+"건 추가 성공");
			} else {
				System.out.println("sql 처리 실패");
			}
		} catch (SQLException e) {
			System.out.println("sql 구문 오류");
			e.printStackTrace();
		} finally {
			oracle.close(pstmt, con);
		}
//update	
		con = null;
		pstmt = null;
		i = 0;
		
		std = new Student(6, "조빈", 100);
		sql ="update student set name=?, point=? where no=?";
		
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, std.getName());
			pstmt.setInt(2, std.getPoint());
			pstmt.setInt(3, std.getNo());
			i = pstmt.executeUpdate();
			if(i>0) {
				System.out.println(i+"건 변경 성공");
			} else {
				System.out.println("sql 처리 실패");
			}
		} catch (SQLException e) {
			System.out.println("sql 처리 실패");
			e.printStackTrace();
		} finally {
			oracle.close(pstmt, con);
		}
		
		con = null;
		pstmt = null;
		i =0 ;
//delete
		int bun = 4;
		sql = "delete from student where no=?";
	
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bun);
			i = pstmt.executeUpdate();
			if(i>0) {
				System.out.println(i+"건 삭제 성공");
			} else {
				System.out.println("sql 처리 실패");
			}
		} catch (SQLException e) {
			System.out.println("sql 구문 오류");
			e.printStackTrace();
		} finally {
			oracle.close(pstmt, con);
		}
		
				
		
		
	
		
	}

}
