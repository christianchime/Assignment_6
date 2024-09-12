package com.BusyQA.Assignment8;

import java.util.Scanner;

public class CalculationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Calculate the Sum of 3 numbers\nEnter first number: ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.print("Enter second number: ");
		int y = input.nextInt();
		System.out.print("Enter third number: ");
		int z = input.nextInt();
		input.close();
		
		//call constructor
		Calculation calc = new Calculation(x, y, z);
		//call method
		calc.sum();
	}
}