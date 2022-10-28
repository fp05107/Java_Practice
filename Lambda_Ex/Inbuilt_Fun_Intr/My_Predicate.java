package Inbuilt_Fun_Intr;

import java.util.function.Predicate;
import java.util.*;

public class My_Predicate {


	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> i > 0;
		System.out.println(p.test(10));//true
		System.out.println(p.test(-10));//false

		
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(10, "name1", 650));
		students.add(new Student(12, "name2", 750));
		students.add(new Student(13, "name3", 550));
		students.add(new Student(14, "name4", 820));
		students.add(new Student(15, "name5", 720));
		students.add(new Student(16, "name6", 620));
//		System.out.println(students);
		students.removeIf(student -> student.getMarks() < 700);
		System.out.println(students);

	}

}
