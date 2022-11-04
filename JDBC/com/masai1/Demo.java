package com.masai1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
//	{
//		System.out.println("I am non static");
//	}
//	
//	static {
//		System.out.println("hi i am static");
//	}
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.masai1.A");
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("get the driver class...");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/web20sb101db";
		
		try {
			Connection conn = DriverManager.getConnection(url,"root","subham@1234");
			System.out.println("Connected.....");
			System.out.println(conn.getClass().getName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
