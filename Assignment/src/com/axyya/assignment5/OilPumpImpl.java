package com.axyya.assignment5;

import java.util.Scanner;

public class OilPumpImpl {
	public static void main(String[] args) {

		OilPump cost = (quantity, fuelType) -> {
			int price = fuelType ? (quantity * 105) : (quantity * 100);
			return price;
		};
		System.out.println("Enter true if fuel type is PowerPetrol and false if fuel type is RegularPetrol:");
		Scanner scan = new Scanner(System.in);
		boolean type = scan.nextBoolean();
		System.out.println("Enter fuel quantity in liters:");
		int quantity = scan.nextInt();
		System.out.println("Your Bill Is:");
		int money = type ? cost.bill(quantity, type) : cost.bill(quantity, type);
		System.out.println(money + " Rs");
	}
}
