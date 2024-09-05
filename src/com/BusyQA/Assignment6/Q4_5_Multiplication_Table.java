package com.BusyQA.Assignment6;

import java.util.Scanner;

public class Q4_5_Multiplication_Table {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				// Write a Java to display the multiplication table of a given integer using for loop.
		Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the number you want to generate a multiplication table for: ");
			int number = input.nextInt();
			
			System.out.println(number + " times table: ");
			for(int i = 1 ; i <= 12; i++) 
			{
				int multiple = number * i;
				System.out.println(number + " x " + i + " = " + multiple);
			}
		}
	}

}
