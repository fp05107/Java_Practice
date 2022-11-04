package com.subham2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		HashSet<Integer> hs = new HashSet<>(10,0.8f);
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		List<Integer> al = new ArrayList<>(hs);
		System.out.println(al);
		//To preserve the sequence we should use linkedhashset
		Integer x = 1;
		System.out.println(x.equals(1));
	}
}
