package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] Args) {

		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an item price");
		double amount = kb.nextDouble();
		System.out.println("Please enter an amount tendered");
		double tendered = kb.nextDouble();
		double change = tendered - amount;

		if (change == 0) {
			System.out.println("Thank You");
		} else {
			if (change >= 0) {
				System.out.println("\tTranscation Details");
				System.out.println("\t-------------------");
				System.out.println("\tAmount:\t\t" + amount);
				System.out.println("\tTendered:\t" + tendered);
				System.out.print("\tChange:\t\t");
				System.out.printf("%.2f", change);
				change = change + 0.01f;
				System.out.print("\nResult:\n");
				makeChange(change);
			} else {
				System.out.println("Amount tendered less than price. Try Again.");
			}
		}
	}

	private static void makeChange(double change) {
		double oldChange = 0;
		if (change >= 20) {
			oldChange = change;
			change = change % 20;
			double twenties = (int) ((oldChange - change) / 20);
			System.out.print(" Twenties:" + twenties);
		}
		if (change >= 10) {
			oldChange = change;
			change = change % 10;
			double tens = ((oldChange - change) / 10);
			System.out.print(" Tens:" + tens);

		}
		if (change >= 5) {
			oldChange = change;
			change = change % 5;
			double fives = ((oldChange - change) / 5);
			System.out.print(" Fives:" + fives);

		}
		if (change >= 1) {
			oldChange = change;
			change = change % 1;
			double ones = ((oldChange - change) / 1);
			System.out.print(" Ones:" + ones);
		}
		if (change >= 0.25) {
			oldChange = change;
			change = change % 0.25;
			double quarters = ((oldChange - change) / 0.25);
			System.out.print(" Quarters:" + quarters);

		}
		if (change >= 0.10) {
			oldChange = change;
			change = change % 0.10;
			double dimes = ((oldChange - change) / 0.10);
			System.out.print(" Dimes:" + dimes);

		}
		if (change >= 0.05) {
			oldChange = change;
			change = change % 0.05;
			double nickels = ((oldChange - change) / 0.05);
			System.out.print(" Nickels:" + nickels);
		}

		if (change >= 0.01) {
			oldChange = change;
			change = change % 0.01;
			double pennies = ((oldChange - change) / 0.01);
			System.out.print(" Pennies:" + pennies);
		}

	}

}
