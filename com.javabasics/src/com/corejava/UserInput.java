package com.corejava;

import java.util.Scanner;

public class UserInput {

	private static Scanner input;
	private static Scanner scan;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("String in Your Name Now:");
		String myName = input.next();
		System.out.println("println:next(): Your Name is:" +myName);
		System.out.println("\nprintln:nextLine(): Your Name is:" +myName);
		String myName2 = input.nextLine();
		System.out.printf("printf:next(): Your Name is:" +myName2);
		System.out.printf("printf:nextLine(): Your Name is:" +myName2);
		
		scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter Decimal Value");
		double decimal = 0;
		while(decimal != 24.1) {
			System.out.println("DoWhile Loop Test: Enter Code:");
			decimal = scan.nextDouble();
//			System.out.println("You Still in While Loop:..! give Exact Code to Enter in DoWhile Loop");
		}
		double decimal2 = 0;
		do {
			System.out.println("Enter your lucky Number to get Exited from DoWhile:..!");
			decimal2 = scan.nextDouble();
			System.out.println("You are in DoWhile Loop:..! Value1:" +decimal);
			System.out.println("You are in DoWhile Loop:..! Value2:" +decimal2);
		}
		while(decimal2 != 24.1992);
		System.out.println("Exited Fianlly: with Value:" +decimal2);
	
	}

}
