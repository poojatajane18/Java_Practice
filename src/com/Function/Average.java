package com.Function;

//Write a Java method to compute the average of three numbers

public class Average {
	public static int avgCal(int a, int b, int c) {
		return (a+b+c)/3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int average = avgCal(7, 9, 45);
		System.out.println(average);

	}

}
