package com.axyya.assignment;

public class ComparingString {

	public static void main(String[] args) {

		String s1= "example.com";
		
		StringBuffer s2 = new StringBuffer("example.com");

		//1. Write a Java program to compare a given string to the specified string buffer.
		
		System.out.println(s1.equals(s2.toString()));
		
		s1= "Example.com";
		StringBuffer s3 = new StringBuffer("example.co");
		
		
		System.out.println(s1.equals(s3.toString()));
		
	}

}
