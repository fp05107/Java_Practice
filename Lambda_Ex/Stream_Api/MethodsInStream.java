package Stream_Api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Inbuilt_Fun_Intr.Student;

public class MethodsInStream {

	public static void main(String[] args) {

//		ArrayList<String> al = new ArrayList<String>();
//		al.add("one");
//		al.add("one1");
//		al.add("one2");
//		al.add("one3");
//		
//		Stream<String> ss = al.stream();
//		
//		ss.forEach(i -> System.out.println(i));
//		ss.forEach(e->System.out.println(e)); // can not use because forEach is a terminal method.

//		List<Student> students = new ArrayList<>();
//		students.add(new Student(10, "Name1", 850));
//		students.add(new Student(12, "Name2", 750));
//		students.add(new Student(13, "Name3", 650));
//		students.add(new Student(14, "Name4", 950));
//		students.add(new Student(15, "Name5", 750));
		// Stream<Student> str1 = students.stream();
		// Stream<Student> str2 = str1.filter(s -> s.getMarks() > 800);
		// str2.forEach( s -> System.out.println(s.getName()));
//		students.stream().filter(s -> s.getMarks() > 800).forEach(s -> System.out.println(s.getName()));

//		List<Student> l2 = students.stream().filter(e -> e.getMarks()>800).collect(Collectors.toList());
//		System.out.println(l2);

//		ArrayList<String> al = new ArrayList<String>();
//		al.add("ramesh");
//		al.add("suresh");
//		al.add("mukesh");
//		al.add("ajay");
//		Stream<String> ss = al.stream();
		// List list=ss.map(s->{return "welcome "+s;}).collect(Collectors.toList());
		// or without using return keyword
//		List list = ss.map(s -> "welcome " + s).collect(Collectors.toList());
//		list.stream().forEach(s -> System.out.println(s));

//		List<String> citiesL= Arrays.asList("delhi","mumbai","chennai","kolkata");
//		List<String> citiesU = citiesL.stream().map( city -> city.toUpperCase()).collect(Collectors.toList());
//		System.out.println(citiesL);
//		System.out.println(citiesU);

//		List<String>  str = Arrays.asList("1","2","3","4");
//		
//		List l = str.stream().map(e -> Integer.parseInt(e)).filter(e ->e%2==0).collect(Collectors.toList());
//		
//		System.out.println(l);
		
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(10, "n1", 82));
		al.add(new Student(12, "n2", 84));
		al.add(new Student(13, "n3", 81));
		al.add(new Student(14, "n4", 86));
		al.add(new Student(15, "n5", 888));
		int x=al.stream().collect(Collectors.summingInt(s->s.getMarks()));
		
//		System.out.println(x);
		boolean b=al.stream().noneMatch(s->s.getMarks()>800);
		System.out.println(b);

	}
}
















