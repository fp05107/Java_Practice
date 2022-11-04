package com.masai1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Demo2 {
	
	public static void main(String[] args) {
		
//		try {
//			com.mysql.cj.jdbc.Driver d = new Driver();
//			DriverManager.registerDriver(d);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/web20sb101db";
		
		try {
			Connection conn = DriverManager.getConnection(url,"root","subham@1234");
			Statement st = conn.createStatement();
			int x = st.executeUpdate("insert into student values(10,'Ram',500)");
			System.out.println(x+" rows affected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
