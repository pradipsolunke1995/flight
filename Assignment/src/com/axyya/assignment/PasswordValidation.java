package com.axyya.assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
		
		try {
			System.out.println("Enter Password:");
			Scanner scan=new Scanner(System.in);
			String str = scan.nextLine();
			
			int count1=0;
			int count2=0;
			int count3=0;
			int count4=0;
			
			
			Pattern p1=Pattern.compile("[a-z]");
			Matcher m1=p1.matcher(str);
			Pattern p2=Pattern.compile("[A-Z]");
			Matcher m2=p2.matcher(str);
			Pattern p3=Pattern.compile("[0-9]");
			Matcher m3=p3.matcher(str);
			Pattern p4=Pattern.compile("[\\W]");
			Matcher m4=p4.matcher(str);
			
			
			if(m1.find()) {//find lower case
				++count1;
			}
			if(m2.find()) {//find upper case
				++count2;
			}
			while(m3.find()) {//find digits
				count3++;
			}
			if(m4.find()) {//find special characters
				count4++;
			}
			
			
			if(count1==0) {//at least one lower case present
				System.out.println("password should consist at least one lower case");
			}
			else if(count2==0) {//at least one upper case present
				System.out.println("password should consist at least one upper case");
			}
			else if(count3<=1) {//at least two digit present
				
				System.out.println("password should consist at least two digit");
			}
			else if(count4!=0){
				System.out.println("Password can not consist any special character");
			}
			
			else if(str.length()<10) {//Password should be more than 10 character
				System.out.println("password should be more than 10 characters");
			}
			else if(str.length()>20) {//Password should be less than 20 character
				System.out.println("password should be less than 20 characters");
			}
			else {
				System.out.println("Password Accepted");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
