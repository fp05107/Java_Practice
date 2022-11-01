package Enums;

import java.time.Month;

/*
 * 
 */
public class Demo {
	
	public static void main(String[] args) {
		
		MONTH[] m = MONTH.values();
		for(MONTH mon:m) {
			System.out.println(mon+"======="+mon.ordinal());
		}
		
		
	}

}
enum MONTH{
	JAN,FEB,MAR,APR;
	
	public static void main(String[] args) {
		
	}
}