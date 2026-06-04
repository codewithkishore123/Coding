package com.practice.arrays;

public class FIndLargestElement {

	public static void main(String[] args) {
		
		int[] input = {1,2,3,5,1,3,7};
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[j]>input[i]) {
					
					int tmp = input[i];
					input[i]=input[j];
					input[j]=input[i];
				}
			}
		}
		System.out.println("The largest number is : "+input[0]);
		
	}

}
