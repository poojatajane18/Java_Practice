package com.Loop;
import java.util.Scanner;

/*Write a program that reads a set of integers, and then prints the sum of the
even and odd integers*/

public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		int choice;
		int evenSum = 0;
		int oddSum = 0;
		do {
		System.out.print("Enter the number ");
		number = sc.nextInt();
		if( number % 2 == 0) {
		evenSum += number;
		} else {
		oddSum += number;
		}
		System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
		choice = sc.nextInt();
		} while(choice==1);
		System.out.println("Sum of even numbers: " + evenSum);
		System.out.println("Sum of odd numbers: " + oddSum);
		

	}

}
