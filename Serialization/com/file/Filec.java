package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filec {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("abc.txt");
		fw.write(100);

		fw.write("ramesh\nwelcome");
		fw.write("\n");
		fw.write("india");
		fw.write("\n");
		char ch[] = { 'a', 'b', 'c' };
		fw.write(ch);
		fw.flush();
		fw.close();
		System.out.println("done");

	}

}
