package com.Function;

public class SumFO {
	
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sum(int a, int b,int c) {
		return a+b+c;
	}
	public static float sum(float a, float b) {
		return a+b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum of two no. : "+sum(5, 3));
		System.out.println("Sum of three no. : "+sum(5, 2,1));
		System.out.println("Sum of two float no. : "+sum(3.2f,4.8f));

	}

}
