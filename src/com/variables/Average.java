package com.variables;
import java.util.Scanner;
/*In a program, input 3 numbers : A, B and C. 
You have to output the average of these 3 numbers.*/


public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int avg =(A+B+C)/3;
		System.out.println("Average of Three No. = "+avg);
		
		

	}

}
