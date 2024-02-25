package com.Conditional;
import java.util.Scanner;

/*Write a Java program to get a number from the user and print whether it is
positive or negative*/

public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num = sc.nextInt();
		
		if(num>0)
			System.out.println("It is Positive Number");
		else
			System.out.println("It is Negative Number");

	}

}
