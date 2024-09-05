package com.BusyQA.Assignment6;

import java.util.Scanner;

public class Q4_7_Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to reverse a number using while loop.
			try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter Number: ");
			int number = input.nextInt();
			
			int temp = number;
			int r = 1;
			int q = number; 
			int reverse = 0;
			
			while (q >= 1)
			{
			q = temp / 10;
			r = temp % 10;
			
			reverse = (reverse * 10) + r;
			
			temp = q;
			}
			System.out.println("The Reverse of: " + number + " is " + reverse);
		}
	}

}
