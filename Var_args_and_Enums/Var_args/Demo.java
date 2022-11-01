package Var_args;
//variable number of arguments
//this is developed based on array concept only in much more simplified way
/*
 * if we want to use any other parameter along with than var-args should be the last parameter
 * we can not have 2 var args in a single method
 * var-args has the least priority
 */
public class Demo {
	public static int add(int...arr) {
		int result = 0;
		for(int i: arr) {
			result+=i;
		}
		
		return result;
	}
	public static int add(int i) {
		return i;
	}
	public static void main(String[] args) {
		
//		System.out.println(add(100,2,3,4,5,6));
//		System.out.println(add(null));
//		System.out.println(add());
//		System.out.println(add(10));
		
		Student[] students = {
			new Student(10, "subham", 50)
				
		};
		fun1(students);
	}
	
	public static void fun1(Student...students) {
		for(Student s:students) {
			System.out.println(s);
		}
	}
}
