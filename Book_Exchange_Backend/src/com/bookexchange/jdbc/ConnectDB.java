package com.bookexchange.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/BookExchange?useSSL=false&serverTimezone=UTC";
		String user = "admin";
		String pass = "admin123";
		
		try {
			System.out.println("Connecting to database " + jdbcUrl);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

			System.out.println("Connection successful!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
