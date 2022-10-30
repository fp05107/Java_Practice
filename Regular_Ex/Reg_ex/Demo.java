package Reg_ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	
	public static void main(String[] args) {
		
		int count = 0;
		Pattern p = Pattern.compile("b");
		Matcher m = p.matcher("abbbabbaba");
		while (m.find()) {
		count++;
		System.out.println(m.start() + "------" + m.end() + "------" + m.group());
		}
		System.out.println("The no of occurences:" + count);

	}
}
