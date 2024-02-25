package com.Array;

public class MaxSubarrayKadanes {
	public static void printMaxarray(int numbers[]) {
		int ms=0;
		int cs=Integer.MIN_VALUE;
		
		for(int i=0; i<numbers.length; i++) {
			cs = cs + numbers[i];
			
			if(cs < 0)
				cs = 0;
			ms = Math.max(cs, i);
		}
		System.out.println("Our max Subarray sum is : "+ms);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
		printMaxarray(numbers);

	}

}
