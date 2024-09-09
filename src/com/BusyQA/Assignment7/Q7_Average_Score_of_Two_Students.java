package com.BusyQA.Assignment7;

import java.util.Arrays;

public class Q7_Average_Score_of_Two_Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scoreArray = {{90, 85, 95},
								{82, 92, 87}};
		int rLength = scoreArray.length;
		int cLength = scoreArray[0].length;
		int sum = 0;
		float totalSum = 0;
		System.out.println("For Array: " + Arrays.deepToString(scoreArray) + "\n");
		
		for (int i = 0; i <= rLength - 1; i++) 
		{
			for (int j = 0; j <= cLength - 1; j++) 
			{
			sum = sum + scoreArray[i][j];
			}
			float average = (float) sum / cLength;
			System.out.println("Average score for student " + (i +1) + " = " + average);
			totalSum = totalSum + sum;
			sum = 0;
		}
		
		System.out.println("\nAverage score of all " + rLength + " students = " + (totalSum / (rLength * cLength)));
	}

}
