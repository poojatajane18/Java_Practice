package com.Loop;

/*
                      * 
				     * * 
				    * * * 
				   * * * * 
				  * * * * * 
				 * * * * * * 
 */


public class Traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int line=0; line<=n; line++) {
			//spaces
			for(int j=0; j<=(n-line); j++) {
				System.out.print(" ");
			}
			
			//Stars
			for(int j=0; j<=line-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}

}

