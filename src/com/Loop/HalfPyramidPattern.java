package com.Loop;

public class HalfPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 4;
		
		for(int line=1; line<=n; line++) {
			for(int number=1; number<=line; number++) {
				System.out.print(number);
			}
			System.out.println();
		}

	}

}
