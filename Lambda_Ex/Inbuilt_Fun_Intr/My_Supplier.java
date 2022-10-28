package Inbuilt_Fun_Intr;

import java.util.function.Supplier;

//It represents a function which does not take in any argument but produces a value of type T.

public class My_Supplier {

	public static void main(String[] args) {

		Supplier<String> s = () -> "This is from Lambda Expression";
		System.out.println(s.get());
		
		Supplier<Student> s2 = () -> new Student(10, "Ram", 850);
		System.out.println(s2.get());

	}
}
