package com.BusyQA.Assignment6;

import java.util.Scanner;

public class Q2_Sum_of_Numbers {

	public static void main(String[] args) {
		// Write a Java program to print the sum of two numbers.
		// Test Data: 4 + 36
		System.out.println("FIND THE SUM OF TWO NUMBERS");
		
		int a,b;
		Scanner read = new Scanner(System.in); // Reading from System.in
		System.out.println("Enter first Number: ");
		a = read.nextInt(); 
		System.out.println("Enter Second number: ");
		b = read.nextInt(); 
		read.close();
		
		int c = a + b;
		System.out.println("The Sum of the first and second number is: " + c);

	}

}
