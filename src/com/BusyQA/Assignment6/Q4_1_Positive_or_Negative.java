package com.BusyQA.Assignment6;

import java.util.Scanner;

public class Q4_1_Positive_or_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to get a number from the user and print whether it is positive or negative
		
		Scanner read = new Scanner(System.in); // Reading from System.in
		System.out.println("\nInput Number: ");
		int a = read.nextInt(); 
		read.close();

		if(a >= 0) 
		{
			System.out.println(a + " is positive");
		}
		else 
		{
			System.out.println(a + " is negative");
		}
		
	}

}
