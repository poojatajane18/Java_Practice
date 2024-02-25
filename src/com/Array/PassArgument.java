package com.Array;

import java.util.Scanner;

//Passing array as argument

public class PassArgument {
	public static void update(int marks[],int nonchangable) {
		int nonchanged =10;//Simple value not affected in main function
		for(int i=0; i<marks.length; i++) {
			marks[i]=marks[i]+1; //add one in all subject
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark[] = new int[30];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		mark[0]=sc.nextInt();
		mark[1]=sc.nextInt();
		mark[2]=sc.nextInt();
		
		for(int i=0; i<mark.length; i++) {
			System.out.print(mark[i]+" ");
		}
		System.out.println();
		int notchange =5;
		System.out.println("Remain same not afeected we just passed array as reference : "+notchange);

	}

}
