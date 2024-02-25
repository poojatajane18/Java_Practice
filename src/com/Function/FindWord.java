package com.Function;

public class FindWord {
	
	public static void findSecondWord(String sentence) {
		String arr[] = sentence.split(" ");
		if(arr.length >= 2) {
			String secondWord = arr[1];
			System.out.println("The second word is "+secondWord);
		}
		
	}	
	
	public static void main(String args[]) {
		String sentence ="Welcome Vynsis IT Services";
		System.out.println("The given sentence : "+sentence);
		findSecondWord(sentence);
		
	}
}

/*
 * OUTPUT : The given sentence : Welcome Vynsis IT Services
The second word is Vynsis

 */
		
