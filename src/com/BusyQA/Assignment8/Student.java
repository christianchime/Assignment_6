package com.BusyQA.Assignment8;

public class Student {
	int sId;
	String sName;
	int sub1, sub2, sub3;
	int total;
	
	void getStuData(int sId, String sName) {
		this.sId = sId;
		this.sName = sName;	
//		sId = id;
//		sName = name;
	}
	
	void getStuMarks(int s1, int s2, int s3) {
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
	}
	
	void totalMarks() {
		total = sub1 + sub2 + sub3;
		System.out.println(sId + " | " +sName);
		System.out.println("Biology: " + sub1);
		System.out.println("Chemistry: " + sub2);
		System.out.println("Physics: " + sub3);
		System.out.println("Total: " + total + "\n");
	}
}