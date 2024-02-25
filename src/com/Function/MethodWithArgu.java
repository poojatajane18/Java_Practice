package com.Function;

import java.util.Scanner;

public class MethodWithArgu {
	
	//No argument method
	public static void printHelloWorld() {
		System.out.println("Hello world");
		System.out.println("Hello world");
	}
	public static int calculateSum(int num1, int num2) {
		int sum = num1+ num2;
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values : ");
		int a=sc.nextInt();
		int b = sc.nextInt();
		int sum = calculateSum(a, b);
		System.out.println("Sum is : "+sum);
		printHelloWorld();

	}

}
