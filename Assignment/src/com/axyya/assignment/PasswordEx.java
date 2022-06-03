package com.axyya.assignment;

import java.util.Scanner;

public class PasswordEx {
    // function 1
	public static boolean isAlphaNumeric(String s) {
		return s != null && s.matches("^[a-zA-Z0-9]*$");
	}
	//function 2
    public static boolean isTwoPlusDig(String s) {
    	int count = 0;
    	for(int i=0; i<s.length();i++) {
    		if (s.charAt(i) >='0' && s.charAt(i) <='9') {
    			count++;
    		}    		
    	}
    	if(count>=2) {
    		return(true);
    	}
    	else {
    		return(false);
    	}
    	
    }
	public static void main(String[] args) {
		System.out.println("Enter any Password :");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		boolean check1=false,check2=false,check3=false;

		//checking 1st condition(password length should be min 10 character)
		if(str.length()>=10) {
			check1=true;
		}
		//A password consists of only letters and digits.
		//calling function 1
		if(isAlphaNumeric(str)) {
			check2=true;
		}
		//A password must contain at least two digits.
		//calling function 2
		if(isTwoPlusDig(str)) {
			check3=true;
		}
		
		if (check1 && check2 && check3) { 
			System.out.println("Password " +str+ " is Valid ");
		}
		else {
			System.out.println("Password " +str+ " is Invalid" );
		}
		sc.close();
	}
}