package com.Function;

public class Factorial {
	public static int factNumber(int n) {
		int fact =1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Factorial : "+factNumber(4));

	}

}
