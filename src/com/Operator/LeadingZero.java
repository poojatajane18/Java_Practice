package com.Operator;

public class LeadingZero {

	//Java program to remove leading zeros
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Program";
		for(int i=0;i<s.length();i++) {
			boolean val = true;
			for(int j =0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j+1)) {
					val =false;
					break;
				}
			}
			if(val) {
				System.out.println(s.charAt(i));
			}
		}
	}

}
