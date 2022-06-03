package com.axyya.assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationPasswordOld {

	public static void main(String[] args) {

		
		try {
			System.out.println("Enter Password:");
			Scanner scan=new Scanner(System.in);
			String str = scan.nextLine();
			
			int count1=0;
			int count2=0;
			int count3=0;
			int count4=0;
			int count5=0;
			
			Pattern p1=Pattern.compile("[a-z]");
			Matcher m1=p1.matcher(str);
			Pattern p2=Pattern.compile("[A-Z]");
			Matcher m2=p2.matcher(str);
			Pattern p3=Pattern.compile("[0-9]");
			Matcher m3=p3.matcher(str);
			Pattern p4=Pattern.compile("[\\W]");
			Matcher m4=p4.matcher(str);
			Pattern p5=Pattern.compile("[\\s]");
			Matcher m5=p5.matcher(str);
			
			if(m1.find()) {//find lower case
				++count1;
			}
			if(m2.find()) {//find upper case
				++count2;
			}
			if(m3.find()) {//find digit
				++count3;
			}
			if(m4.find()) {//find character
				++count4;
			}
			if(m5.find()) {//find space
				++count5;
			}
			
			if(count1==0) {//at least one lower case present
				System.out.println("password should consist at least one lower case");
			}
			if(count2==0) {//at least one upper case present
				System.out.println("password should consist at least one upper case");
			}
			if(count3==0) {//at least one digit present
				System.out.println("password should consist at least one digit");
			}
			if(count4==0) {//at least one character present
				System.out.println("password should consist at least one special character");
			}
			if(count5!=0) {//space not allowed
				System.out.println("password should not consist space");
			}
			if(str.length()<8) {//Password should be more than 8 character
				System.out.println("password should be more than 8 characters");
			}
			if(str.length()>20) {//Password should be less than 20 character
				System.out.println("password should be less than 20 characters");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
