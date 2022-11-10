package com.masai.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.model.Student;
import com.masai.utility.DBUtil;
import com.mysql.cj.protocol.Resultset;


public class StudentDaoImpl implements StudentDao {
	
	
	@Override
	public String insertStudentDetails(int roll, String name, int marks) {
		String message = "Not Inserted.......";

		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setInt(3, marks);
			int x = ps.executeUpdate();
			if (x > 0) {
				message = "Record inserted successfully.......";
			}
		} catch (SQLException e) {
			message = e.getMessage();
		}
		return message;
	}

	@Override
	public String insertStudentDetails2(Student student) {

		String message = "Not Inserted.......";

		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, student.getRoll());
			ps.setString(2, student.getName());
			ps.setInt(3, student.getMarks());
			int x = ps.executeUpdate();
			if (x > 0) {
				message = "Record inserted successfully.......";
			}
		} catch (SQLException e) {
			message = e.getMessage();
		}
		return message;

	}


	@Override
	public int getMarksByRoll(int roll) {
		int marks = -1;
		try (Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select marks from student where roll=?");
			ps.setInt(1, roll);
			ResultSet rs  = ps.executeQuery();
			if(rs.next()) {
				marks = rs.getInt("marks");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return marks;
	}

	@Override
	public Student getStudentByRoll(int roll) {
		
		Student student = null;
		try(Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps =  conn.prepareStatement("select * from student where roll = ?");
			ps.setInt(1, roll);
			ResultSet rs =  ps.executeQuery();
			if(rs.next()) {
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				int m = rs.getInt("marks");
				student = new Student(r, n, m);
//				System.out.println("roll is: "+r);
//				System.out.println("name is: "+n);
//				System.out.println("marks is: "+m);
//				
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return student;
		
	}

	

}
