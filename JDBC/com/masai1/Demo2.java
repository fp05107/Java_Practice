package com.masai1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Demo2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll: ");
		int roll = sc.nextInt();
		System.out.println("Enter Name: ");
		String name = sc.next();
		System.out.println("Enter Mark: ");
		int marks = sc.nextInt();
		
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
//		Connection conn = null;
		try (Connection conn = DriverManager.getConnection(url,"root","subham@1234")){
			
//			Statement st = conn.createStatement();
//			int x = st.executeUpdate("insert into student values("+roll+",'"+name+"',"+marks+")");
//			System.out.println(x+" rows affected");
			
			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setInt(3, marks);
			
			int x = ps.executeUpdate();
			
			
			if(x>0) {
				System.out.println("Record inserted successfully......");
			}else {
				System.out.println("Fails.....");
			}
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
//		finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
	}
}
