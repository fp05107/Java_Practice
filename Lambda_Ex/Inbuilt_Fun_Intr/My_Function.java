package Inbuilt_Fun_Intr;

import java.util.function.Function;
//This interface defines an abstract method which will takes T type of object as parameter and returns R
//type of object.

public class My_Function {

	public static void main(String[] args) {

		Function<Integer, String> f = i -> "This is a number " + i;
		System.out.println(f.apply(10));
		
		Function<String, Integer> f2 = s -> Integer.parseInt(s);
		System.out.println(f2.apply("200") + 500);
		
		Function<String, Integer> f3 = Integer::parseInt;
		System.out.println(f3.apply("400") + 200);

	}

}
