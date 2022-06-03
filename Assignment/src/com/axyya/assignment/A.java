package com.axyya.assignment;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class A {

	public static void main(String[] args) {
		File f = new File("D://newFolder//test.txt");
		try {
			FileWriter fr= new FileWriter(f);
			fr.write("i have created the file");
			FileReader read= new FileReader(f);
			System.out.println(read.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
