package com.BusyQA.Assignment6;

import java.util.Scanner;

public class Q4_3_Days_in_Month {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner read = new Scanner(System.in)) {
			System.out.println("NUMBER OF DAYS IN ANY MONTH"
					+ "\nInput any Month Number from 1 to 12 (MM): ");
			int month = read.nextInt(); 
			
			if (month >= 1 && month <= 12) 
			{
			switch (month) {
			  case 1:
			    System.out.println("January has 31 days");
			    break;
			  case 2:
			    System.out.println("February has 28 days");
			    break;
			  case 3:
			    System.out.println("March has 31 days");
			    break;
			  case 4:
			    System.out.println("April has 30 days");
			    break;
			  case 5:
			    System.out.println("May has 31 days");
			    break;
			  case 6:
			    System.out.println("June has 30 days");
			    break;
			  case 7:
			    System.out.println("July has 31 days");
			    break;
			  case 8:
				System.out.println("August has 31 days");
				break;
			  case 9:
				System.out.println("September has 30 days");
				break;
			  case 10:
				System.out.println("October has 31 days");
				break;
			  case 11:
				System.out.println("November has 30 days");
				break;
			  case 12:
				System.out.println("December has 31 days");
				break;
				}
			}
			else
			{
				System.out.println("\nThats not a valid number, try again");
			}
			
			
		}
	}
}
