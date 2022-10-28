package Func_Intr;

public class Demo1 {
	public static void main(String[] args) {

		demo d = (s) -> {
			System.out.println(s.getMarks());
			System.out.println(s.getRoll());
			System.out.println(s.getName());
		};
		Student s = new Student(10, "Subham", 100);

//		d.method(new Student(10, "Subham", 100));
		d.method(s);
	}

}

@FunctionalInterface
interface demo {
	void method(Student s);
}


