package com.BusyQA.Assignment7;

import java.util.Arrays;

public class Q6_Duplicate_Elements_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 8, 9, 14};
		boolean d = false;

		System.out.println("For Array: " + Arrays.toString(array) + "\n");
		
		for (int i = 0; i <= array.length - 1; i++) 
		{
			for (int j = i + 1; j <= array.length - 1; j++) 
			{
				if(array[i] == array[j]) 
				{
				System.out.println("Value " + array[i] + " at index " + i + " has a duplicate at index " + j);
				d = true;
				}
			}
		}
		if (d == false) 
		{
		System.out.println("There are no duplicates");
		}
	}
}