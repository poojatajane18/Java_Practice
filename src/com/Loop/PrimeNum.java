package com.Loop;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		if(n==2) {
			System.out.println(n+" is a prime");
		}
		else {
			boolean isPrime = true;
			for(int i=2; i<=n-1;i++) {
				if(n%i == 0)
					isPrime=false;
				//n is a multiple of i(i is not equal to 1 or n
			}
			if(isPrime == true)
				System.out.println(n+" is a prime");
			else
				System.out.println(n+" is not a prime");
		}

	}

}
