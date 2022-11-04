package com.masai1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gmarks");
		int gmarks = sc.nextInt();
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String url = "jdbc:mysql://localhost:3306/web20sb101db";
			
			try(Connection conn = DriverManager.getConnection(url,"root","subham@1234")){
				
				PreparedStatement ps = conn.prepareStatement("update student set marks = marks+? where marks<900");
				
				ps.setInt(1, gmarks);
				int x = ps.executeUpdate();
				
				if(x>0) {
					System.out.println(x+" rows updated successfully....");
				}else {
					System.out.println("no rows affected");
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
	}
}










