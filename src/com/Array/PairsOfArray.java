package com.Array;

public class PairsOfArray {
	public static void printPair(int numbers[]) {
		int tp=0;
		for(int i=0; i<numbers.length; i++) {
			int curr = numbers[i];
			for(int j=i+1; j<numbers.length; j++) {
				System.out.print("("+curr+","+numbers[j]+")");
				tp++;
			}
			System.out.println();
		}
		System.out.println("Total pair of Array : "+tp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {2,4,6,8,10};
		printPair(numbers);

	}

}
