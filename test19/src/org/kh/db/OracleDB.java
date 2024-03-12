package org.kh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//알아두세요~
public class OracleDB {
	String driver = "oracle.jdbc.driver.OracleDriver";	//ojdvc8.jar 를 불러오는 작업
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "system";
	String userpw = "1234";
	
	Connection con = null;
	PreparedStatement pstmt =null;
	
	public Connection connect() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, userpw);	
			//con (연결) pstmt (전원 ON) -> rs (SQL실행)
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void close(Connection con, PreparedStatement pstmt,ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
