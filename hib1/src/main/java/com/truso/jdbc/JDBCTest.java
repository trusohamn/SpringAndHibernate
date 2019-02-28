package com.truso.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {
	
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=FALSE&serverTimezone=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try {
			System.out.println("Connecting to: " + jdbcUrl);
			Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection created");
		}
		
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
