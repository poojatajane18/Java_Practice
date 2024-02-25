package com.Loop;

import java.util.Scanner;

public class CheckMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter a number : ");
			int n = sc.nextInt();
			if((n%10)==0) {
				System.out.println("Exit because it is multiple of 10");
				break;
			}
			System.out.println(n);
		}while(true);

	}

}
