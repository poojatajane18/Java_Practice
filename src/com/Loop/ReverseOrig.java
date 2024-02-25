package com.Loop;

import java.util.Scanner;

public class ReverseOrig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		//int n=10998;
		int rev = 0;
		
		while(n>0) {
			int lastDigit = n%10;
			rev = (rev*10) + lastDigit;
			n = n/10;
		}
		System.out.println("Reverse of the given Number : "+rev);

	}

}


/*
 OUTPUT  : Enter the Number : 
			897054
		   Reverse of the given Number : 450798
 */
