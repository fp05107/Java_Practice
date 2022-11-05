package com.masai.utility;
import java.sql.*;
public class DBUtil {
	
	public static Connection provideConnection() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/web20sb101db";
		
		try {
			conn = DriverManager.getConnection(url,"root","subham@1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return conn;
		
	}
	
	public static void main(String[] args) {
		
		
	}
}
