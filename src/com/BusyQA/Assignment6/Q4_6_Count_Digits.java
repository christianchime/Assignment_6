package com.BusyQA.Assignment6;

import java.util.Scanner;

public class Q4_6_Count_Digits {
	

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				// Write a Java program count the number of digits of the number using while loop.
		Scanner input = new Scanner(System.in)) {
			System.out.println("Enter Number:");
			int number = input.nextInt();
			
			float divResult = 1;
			int digits = 0;
			float temp = number;
			//absolute value is used so that digits of negative numbers can be obtained
			while (Math.abs(divResult) >= 1) 
			{
				divResult = temp/10;
				temp = divResult;
				digits++;
			}
			System.out.println(number + " has " + digits + " digit(s).");
		}
	}



}
