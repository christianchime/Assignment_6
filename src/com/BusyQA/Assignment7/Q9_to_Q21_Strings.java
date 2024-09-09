package com.BusyQA.Assignment7;

import java.util.Scanner;

public class Q9_to_Q21_Strings {

	public static void main(String[] args) {
		//Q9: compare two strings ignoring case
		String s1 = " Hello World ";
		String s2 = " hello world ";
		boolean sCompare = s1.equalsIgnoreCase(s2);
		System.out.println("\n" + sCompare);
		
		//Q10: Concatenation
		String sConcat = s1.concat(s2);
		System.out.println("\n" + sConcat);
		
		//Q11: Length of string
		int sLength = s1.length();
		System.out.println("\n" + sLength);
		
		//Q12: Substring
		String subString = s1.substring(1, 6);
		System.out.println("\n" + subString);
		
		//Q13: Convert to Upper Case
		String sUpper = s1.toUpperCase();
		System.out.println("\n" + sUpper);
		
		//Q14: Convert to Upper Case
		String sLower = s1.toLowerCase();
		System.out.println("\n" + sLower);
		
		//Q15: Reverse
		for (int i = s1.length() - 1; i >= 0; i--)
		{
		System.out.print(s1.charAt(i));
		}
		
		//Q16: Count the number of times a character is repeated in a string
		char character = 'l'; 
		int rep = 0;
		for (int j = 0; j < s1.length(); j++) {
			if (s1.charAt(j) == character) {
				rep++;
			}
		}
		System.out.println("\n\nCharacter " + character + " appears " + rep + " times");
		
		//Q17: Number of words in a sentence
		String trim = s1.trim();
		System.out.println("\n" + s1 + " contains " + trim.split("\\s+").length + " words");
		
		//Q18: Convert integer to string
		int number = 1234;
		String sNumber = Integer.toString(number);
		System.out.println("\n" + sNumber);
		
		//Q19: Convert string to integer
		int number2 = Integer.parseInt(sNumber);
		System.out.println("\n" + number2);
		
		//Q20: Remove white spaces
		String sRemove = s1.replaceAll("\\s+", "");
		System.out.println("\n" + sRemove);
		
		//Q21: Palindrome or not
		System.out.println("\nEnter Word: ");
		try (Scanner input = new Scanner(System.in)) {
		String word = input.next();
		String newChar;
		String reverse = "";
		for (int k = word.length() - 1; k >= 0; k--) 
		{
			newChar = String.valueOf(word.charAt(k));
			reverse = reverse.concat(newChar);
		}
		if (word.equals(reverse)) 
		{
			System.out.println("Yes! " + word + " is a Palindrome");
		}
		else 
		{
			System.out.println("No, " + word + " is not a Palindrome");
		}
	}
	
	}

}
