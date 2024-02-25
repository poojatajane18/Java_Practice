package com.Function;

public class Primecheck {
	
	/*public static boolean isPrime(int n) {
		boolean isPrime = true;
		if(n == 2)
			return true;
		for(int i =2; i<=n-1; i++ ) {
			if(n%i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}*/
	
	//Prime number for optimization
	public static boolean isPrime(int n) {
		if(n==2) {
			return true;
		}
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i ==0) {
				return false;
			}
		}
		return true;
	}
	
	//Prime Print within the range
	public static void primesInRange(int n) {
		for(int i=2; i<=n; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isPrime(12));
		primesInRange(20);

	}

}
