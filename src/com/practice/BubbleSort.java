package com.practice;

public class BubbleSort {

	
	public static void main(String... args){
		int[] input = {2, 3, 1, 10, 4, -8, 12, -80};
		
		input = bubbleSort(input);
		
		for(int i: input){
			System.out.println(i);
		}
		
	}
	
	public static int[] bubbleSort(int[] input){
		
		//exception handling
	
		boolean correctOrder = true;
		
		do{
			correctOrder = true;
			for(int i = 0; i < input.length - 1; i++){
				if(input[i] > input[i + 1]){
					//swap values
					int temp = input[i+1];
					input[i+1] = input[i];
					input[i] = temp;
					correctOrder = false;
				}
			}
			
			
		}while(!correctOrder);

		
		return input;
	}
	
}
