package com.BusyQA.Assignment6;

public class Q410_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to print Fibonacci Series in the range of 1 to 50. 
		
		int preNum = 0;
		int currentNum = 1;
		int nextNum = 1;
		
		while (nextNum <= 50)
		{
			nextNum = preNum + currentNum;
			System.out.print(currentNum + ", ");
			preNum = currentNum;
			currentNum = nextNum;
		}

	}

}
