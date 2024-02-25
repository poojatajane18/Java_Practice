package com.Conditional;

public class LargestOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1 , b=3 , c=6;
		
		if((a>=b) && (a>=c))
			System.out.println("Largest is A");
		else if(b>=c)
			System.out.println("Largest is B");
		else
			System.out.println("Largest is C");

	}

}
