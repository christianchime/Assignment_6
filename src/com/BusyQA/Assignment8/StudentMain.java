package com.BusyQA.Assignment8;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.getStuData(123, "Chris C.");
		s1.getStuMarks(88, 90, 95);
		s1.totalMarks();
		
		Student s2 = new Student();
		s2.getStuData(124, "Christian C.");
		s2.getStuMarks(89, 91, 96);
		s2.totalMarks();
	}
}