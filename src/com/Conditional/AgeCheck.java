package com.Conditional;

public class AgeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =13;
		if(age >=18)
			System.out.println("Adult");
		else if(age>=13 && age<18)
			System.out.println("Teenager");
		else
			System.out.println("Child");

	}

}
