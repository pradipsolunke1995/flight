package com.axyya.assignment;

public class CharArray {

	//Q. Write a Java program to get the contents of a given string as a character Array
	public static void main(String[] args) {

		String s1 = "C@2a139a55";
		char[] charArray = s1.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}

	}

	

}
