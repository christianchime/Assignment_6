package com.BusyQA.Assignment7;

import java.util.Arrays;

public class Q3_Print_Even_and_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 8, 9, 14};
		int aLength = array.length;
		
		System.out.println("The Array: " + Arrays.toString(array));
		System.out.print("\nEven Numbers: ");
		for (int i = 0; i <= aLength - 1; i++) 
		{
			if ((array[i] % 2) == 0)
			{
				System.out.print(array[i] + ", ");
			}
		}
		System.out.print("\nOdd Numbers: ");
		for (int i = 0; i <= aLength - 1; i++)
		{
			if ((array[i] % 2) != 0)
			{
				System.out.print(array[i] + ", ");
			}
		}
	}
}