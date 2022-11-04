package com.subham2;

public class Demo2 {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "subham", 100);
		Student s2 = new Student(10, "subham", 100);
		
		System.out.println(s1.equals(s2));
	}
}
