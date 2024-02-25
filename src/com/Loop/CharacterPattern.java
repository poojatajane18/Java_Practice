package com.Loop;

public class CharacterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		char ch = 'A';
		
		//outer loop
		for(int line=1; line<=n; line++) {
			//Inner loop
			for(int chars=1; chars<=line; chars++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}

}
