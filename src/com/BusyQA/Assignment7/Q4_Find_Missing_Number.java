package com.BusyQA.Assignment7;

import java.util.Arrays;

public class Q4_Find_Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 8, 9, 14};
		int[] array2 = {0, 0, 0, 0, 0, 0};
		
		//index to be deleted
		int index = 5;
		int missing = 0;
		System.out.println("Initial Array: " + Arrays.toString(array));
		
		for (int i = 0, j = 0; i <= (array.length - 1); i++)
		{
			if (i == index) {
				missing = array[i];
			}
			else {
				array2[j] = array[i];
				j++;
			}
		}
		System.out.println("\nArray after removing value at index " + index + ": " + Arrays.toString(array2));
		System.out.println("\nMissing value from initial array: " + missing);
	}

}
