package com.BusyQA.Assignment8;

public class Calculation {	
	int a, b, c, sum;
	
	Calculation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	void sum() {
		sum = a + b + c;
		System.out.println("Sum = " + sum);
	}
}