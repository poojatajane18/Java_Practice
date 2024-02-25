package com.Conditional;
import java.util.Scanner;


/*a Java program that takes a year from the user and print whether that
year is a leap year or not.*/

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the year: ");
		int year = sc.nextInt();
		boolean x = (year % 4) == 0; 
		System.out.println(x);
		
		boolean y = (year % 100) != 0;
		System.out.println(y);
		
		boolean z = ((year % 100 == 0) && (year % 400 == 0));
		System.out.println(z);
		if (x && (y || z)) {
		System.out.println(year + " is a leap year");
		} else {
		System.out.println(year + " is not a leap year");
		}

	}

}
