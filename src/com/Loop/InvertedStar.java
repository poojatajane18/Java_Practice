package com.Loop;

/*
               *******
               ******
               *****
               ****
               ***
               **
               *
*/

public class InvertedStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int line=1; line<=n; line++) {
			for(int star=1; star<=n-line+1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
