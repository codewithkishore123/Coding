package com.practice.arrays;

public class FindElementsExistsOrNot {

	public static void main(String[] args) {
		
		int[] input = {1,2,4,5,6};
		
		int target = 4;
		
		for(int i=0;i<input.length;i++) {
			if(target==input[i]) {
				System.out.println("Element Found");
				break;
			}
		}
	}

}
