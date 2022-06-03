package com.axyya.assignment5;

public class SquareRootImpl {

	
	public static void main(String[] args) {
		
		SquareRoot root = new SquareRoot() {
			
			@Override
			public double squareRoot(int value) {
				return (Math.sqrt(value));
			}
		};
		
		double squareRoot = root.squareRoot(12);
		System.out.println(squareRoot);
	}
}
