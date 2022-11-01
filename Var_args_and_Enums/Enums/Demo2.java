package Enums;

import java.util.Scanner;

public class Demo2 {
	public void printCity(City city) {
		if(city!=null) {
			city.message();
		}else {
			System.out.println("not valid");
		}
		
	}
	
	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		City cityname = City.valueOf(s.toUpperCase());
		
		d2.printCity(cityname);
		d2.printCity(City.MUMBAI);
	}
}
