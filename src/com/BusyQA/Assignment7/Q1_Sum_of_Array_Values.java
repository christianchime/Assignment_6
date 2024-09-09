package com.BusyQA.Assignment7;

public class Q1_Sum_of_Array_Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 8, 9, 14};
		
		int aLength = array.length;
		int sum = 0;
		
		for (int i = aLength - 1; i >= 0; i--) 
		{
			sum = sum + array[i];
		}
		System.out.println("Array Sum = " + sum);
	}

}