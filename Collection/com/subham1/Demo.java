package com.subham1;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(null);
		
		System.out.println(list.get(9));
		Object[] x = list.toArray();
		System.out.println(x[6]);
		
//		ArrayList al = new ArrayList();
//		al.add(10);
//		al.add("dfnij");
//		System.out.println(al);
	}

}
