package com.subham1;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

//8 primitive datatypes are there
//generics
public class Demo2 {
	
	public static void main(String[] args) {
		
		int x = 10;
		Integer y = Integer.valueOf(x);//boxing
//		System.out.println(y);
		int z = 20;
		//System.out.println(z+y.intValue());//unboxing
		Integer i = new Integer(67);
		//System.out.println(i);
		//contains-> belongs to collection interface
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		
//		Object[] obj = list.toArray();
//		for(Object o: obj) {
//			String s = (String)o;
//			System.out.println(s);
//		}
		
		java.util.Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
