package com.BusyQA.Assignment6;

import java.util.Scanner;

public class Q4_2_Greatest_of_3_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to find greatest of 3 numbers.
		
		int a, b, c, d = 0;
		Scanner read = new Scanner(System.in); // Reading from System.in
		System.out.println("Enter first Number: ");
		a = read.nextInt(); 
		System.out.println("Enter Second number: ");
		b = read.nextInt(); 
		System.out.println("Enter Third number: ");
		c = read.nextInt();
		read.close();
		
		if (a >= b && a >= c) 
		{
			d = a;
		}
		else if (b >= a && b >= c) 
		{
			d = b;
		}
		else
		{
			d = c;
			
		}
		System.out.println("\nThe Greatest Number is: " + d);
		}
}