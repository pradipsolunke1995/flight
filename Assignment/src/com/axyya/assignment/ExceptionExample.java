package com.axyya.assignment;

public class ExceptionExample {
	
	static int i= 6;

	public static void main(String[] args) {

		try {
			test();
			System.out.println("no exception occured");
		} catch (CustomizedException e) {
			System.out.println("value of i founded to be 5");
			
		}
		
		
	}
	
	static void test() throws CustomizedException {
		if(i==5) {
		throw new CustomizedException();
		}
		
	}

}
