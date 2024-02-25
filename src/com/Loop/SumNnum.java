package com.Loop;

import java.util.Scanner;

public class SumNnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = sc.nextInt();
		int sum = 0;
		int i =1;
		
		while(i<=n) {
			sum = sum+i;
			i++;
		}
		System.out.println("Sum of N natural Number : "+sum);

	}

}
