package com.truso.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
	
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_person?useSSL=FALSE&serverTimezone=UTC";
		String user = "hb";
		String pass = "hb";
		
		Connection conn = null;
		try {
			System.out.println("Connecting to: " + jdbcUrl);
			conn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection created");
		}
		
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
