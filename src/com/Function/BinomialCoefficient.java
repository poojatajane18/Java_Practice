package com.Function;

public class BinomialCoefficient {
	
	public static int factorial(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact= fact*i;
		}
		return fact;
	}
	public static int binCoeff(int n, int r) {
		int fact_n=factorial(n);
		int fact_r=factorial(r);
		int fact_nmr=factorial(n-r);
		
		int binCoeff=fact_n/(fact_r*fact_nmr);
		return binCoeff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Binomial Coefficient is : "+binCoeff(5, 2));

	}

}
