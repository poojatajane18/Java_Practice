package com.Function;

import java.util.Scanner;

/*Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method.*/

public class EvenOdd {
	
	public static boolean isEven(int num) {
		if(num %2 ==0)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for checking odd or even ");
		int n = sc.nextInt();
		System.out.println(isEven(n));

	}

}
