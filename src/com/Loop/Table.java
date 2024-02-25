package com.Loop;

import java.util.Scanner;

/*: Write a program to print the multiplication table of a number N, entered by the
user.
*/

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		int result;
		for(int i=1; i<=10; i++) {
			result = num*i;
			System.out.println(result);
		}
	}

}
