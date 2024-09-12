package com.BusyQA.Assignment8;

public class Calculation2 {
	
	int sum(int x, int y) {
		int s = x + y;
		System.out.println("Sum of 2 integers: " + s);
		return s;
	}
	int sum(int x, int y, int z) {
		int s = x + y + z;
		System.out.println("Sum of 3 integers: " + s);
		return s;
	}
	double sum(double x, double y) {
		double s = x + y;
		System.out.println("Sum of 2 doubles: " + String.format("%.2f", s));
		return s;
	}
	double sum(double x, double y, double z) {
		double s = x + y + z;
		System.out.println("Sum of 3 doubles: " + String.format("%.2f", s));
		return s;
	}
}