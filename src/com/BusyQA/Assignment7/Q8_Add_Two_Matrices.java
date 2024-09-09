package com.BusyQA.Assignment7;

import java.util.Arrays;

public class Q8_Add_Two_Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrixA = {{25, 34, 48},
							{35, 44, 68}, 
							{45, 54, 88}};
		
		int[][] matrixB = {{35, 54, 38},
							{45, 64, 48}, 
							{55, 74, 58}};
		
		int[][] matrixSum = {{0, 0, 0},
							{0, 0, 0}, 
							{0, 0, 0}};
		
		System.out.println("Matrix A = " + Arrays.deepToString(matrixA));
		System.out.println("Matrix B = " + Arrays.deepToString(matrixB));

		
		for (int i = 0; i <= matrixA.length - 1; i++) {
			for (int j = 0; j <= matrixA[0].length - 1; j++) {
				matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		System.out.println("\nSum of both Matrices: " + Arrays.deepToString(matrixSum));
	}
}