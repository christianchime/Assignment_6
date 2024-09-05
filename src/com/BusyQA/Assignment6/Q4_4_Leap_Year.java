package com.BusyQA.Assignment6;

import java.util.Scanner;

public class Q4_4_Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner take = new Scanner(System.in)) {
			System.out.println("Enter the year: ");
			int year = take.nextInt();
			
			
			int remainder = year % 4;
			if (remainder == 0) 
			{
				System.out.println("Yes, " + year + " is a leap year");
			}
			else
			{
				System.out.println("No, " + year + " is not a leap year");
			}
		}
		
	}

}
