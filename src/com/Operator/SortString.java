package com.Operator;

public class SortString {
	
	//Java Program to sort a string

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "openai";
	        char[] chars = input.toCharArray();
	        
	        // Bubble sort
	        for (int i = 0; i < chars.length - 1; i++) {
	            for (int j = 0; j < chars.length - i - 1; j++) {
	                if (chars[j] > chars[j + 1]) {
	                    // Swap characters
	                    char temp = chars[j];
	                    chars[j] = chars[j + 1];
	                    chars[j + 1] = temp;
	                }
	            }
	        }
	        
	        // Convert sorted array back to string
	        String sortedString = new String(chars);
	        
	        System.out.println("Original string: " + input);
	        System.out.println("Sorted string: " + sortedString);
	}

}
