package com.date.time;

import java.time.LocalDate;
import java.time.Month;

public class Demo {
	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate yesterday = ld.minusDays(1);
		System.out.println(yesterday);
//		LocalDate dob = LocalDate.of(1985, Month.OCTOBER, 10);
//		System.out.println(dob);
	}

}
