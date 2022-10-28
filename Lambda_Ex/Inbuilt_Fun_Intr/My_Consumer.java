package Inbuilt_Fun_Intr;
import java.util.function.Consumer;

/*
 * It represents a function which takes in one argument and produces a result. However these kind
 * of functions don’t return any value.

*/
public class My_Consumer {
	
	public static void main(String[] args) {
		
		Consumer<Student> c = s->{
			System.out.println(s.getMarks());
			System.out.println(s.getName());
			System.out.println(s.getRoll());
		};
		
		c.accept(new Student(10, "Subham", 90));
		
	}
	
}
