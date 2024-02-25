package com.variables;

/*QUE 1. In a program, input the side of a square. You have to output the area of the
square.*/

/*QUE 2. What will be the type of result in the following Java code?
 * byte b=4;
		char c='a';
		short s=512;
		int i=1000;
		float f=3.14f;
		double d=99.9954;
		result = (f*b)+(i%c)-(d*5);
 */

/*QUE 3. : (Advanced) Will the following statement give any error in Java?
int $ = 24
*/


public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side=7;
		int area=side*side;
		System.out.println("Area of square = "+area);
		
		byte b=4;
		char c='a';
		short s=512;
		int i=1000;
		float f=3.14f;
		double d=99.9954;
		double result = (f*b)+(i%c)-(d*5);
		System.out.println(result);
		//In the mentioned code, the result variable will be of double type because of type conversion.
		
		
		
		int $ =24;
		System.out.println($);
		/*
		 * No, the statement will not give any error.
		   Names of variables are called identifiers in Java. Identifier rule says, identifiers can start with
		any alphabet or underscore (“_”) or dollar (“$”).
		According to the rule the given variable name is a valid identifier
		 */

	}

}
