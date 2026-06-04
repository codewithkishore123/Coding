package com.practice.arrays;

public class SumOfAllElementsInArray {

	public static void main(String[] args) {
	
		int[] input = {1,2,3,4,5,6};
		int sum = 0;
		for(int i=0;i<input.length;i++) {
			sum=sum+input[i];
		}
		System.out.println("The sum is : "+sum);
	}

}
