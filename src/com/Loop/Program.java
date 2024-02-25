package com.Loop;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter your num : ");
			int n = sc.nextInt();
			if(n%10 == 0) {
				continue;
			}
			System.out.println("Number was : "+n);
		}while(true);

	}

}
