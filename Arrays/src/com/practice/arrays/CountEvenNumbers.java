package com.practice.arrays;

public class CountEvenNumbers {

	public static void main(String[] args) {
		
		int[] input = {1,2,3,4,5,6};
		int count=0;
		
		for(int i=0;i<input.length;i++) {
			
			if(input[i]%2==0) {
				count++;
			}
			
		}
		System.out.println("The count of Even Numbers is : "+count);

	}

}
