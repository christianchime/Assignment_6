package com.BusyQA.Assignment6;

import java.util.Scanner;

public class Q4_9_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java Program to print factorial of a given number using any loop.
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter Number: ");
			int number = input.nextInt();
			
			long fact = number;
			
			for (int i = number - 1; i >= 1; --i) 
			{
				fact = fact * i;
				
			}
			
			System.out.println(number + " Factorial is: " + fact);
		}
	}

}
