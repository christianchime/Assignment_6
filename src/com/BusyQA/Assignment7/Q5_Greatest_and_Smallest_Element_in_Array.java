package com.BusyQA.Assignment7;

import java.util.Arrays;

public class Q5_Greatest_and_Smallest_Element_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 8, 9, 14};
		int g = array[0]; //greatest value
		int s = array[0]; //smallest value
		
		for (int i = 0; i <= array.length - 1; i++) {
			if(array[i] >= g) {
				g = array[i];
			}
			
			if(array[i] <= s) {
				s = array[i];
			}
		}
		
		System.out.println("For Array: " + Arrays.toString(array));
		System.out.println("\nThe greatest number is:  " + g);
		System.out.println("and the smallest number is:  " + s);
	}

}
