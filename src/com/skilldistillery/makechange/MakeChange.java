package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {


	public static void main(String[] Args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an item price");
		double price = kb.nextDouble();
		System.out.println("Please enter an amount tendered");
		double payment = kb.nextDouble();
		double change = payment - price + 0.01f;
		
		if (change == 0) {
			System.out.println("Thank You");
		} else {
			if (change >= 0) {
				System.out.println("Let me get your change...");
				makeChange(change);
			} else {
				System.out.println("Thats not enough");
			}
		}
	}

	private static void makeChange(double change) {
		double oldChange = 0;
		if (change >= 20) {
			oldChange = change;
			change = change % 20;
			double twenties = (int) ((oldChange - change) / 20);
			System.out.println("Twenties: " + twenties);
		}
		if (change >= 10) {
			oldChange = change;
			change = change % 10;
			double tens = ((oldChange - change) / 10);
			System.out.println("Tens: " + tens);

		}
		if (change >= 5) {
			oldChange = change;
			change = change % 5;
			double fives = ((oldChange - change) / 5);
			System.out.println("Fives: " + fives);

		}
		if (change >= 1) {
			oldChange = change;
			change = change % 1;
			double ones = ((oldChange - change) / 1);
			System.out.println("Ones: " + ones);
		}
		if (change >= 0.25) {
			oldChange = change;
			change = change % 0.25;
			double quarters = ((oldChange - change)/0.25);
			System.out.println("Quarters: " + quarters);

		}
		if (change >= 0.10) {
			oldChange = change;
			change = change % 0.10;
			double dimes = ((oldChange - change) / 0.10);
			System.out.println("Dimes: " + dimes);

		}
		if (change >= 0.05) {
			oldChange = change;
			change = change % 0.05;
			double nickels = ((oldChange - change) / 0.05);
			System.out.println("Nickels: " + nickels);
		}

		if (change >= 0.01) {
			oldChange = change;
			change = change % 0.01;
			double pennies = ((oldChange - change) / 0.01);
			System.out.println("Pennies: " + pennies);
		}

	}

}
