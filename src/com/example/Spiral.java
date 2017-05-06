package com.example;

public class Spiral {
	
	
	public static void main(String[] args) {
		
		int[][] even = {{1, 2},{3, 4}};
		//1 2
		//3 4
	
		int[][] odd = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		//1 2 3
		//4 5 6
		//7 8 9
		
		int[][] evenBigger = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
		//1  2  3  4
		//5  6  7  8 
		//9  10 11 12
		//13 14 15 16
		
		spiralize(even);
		// 1, 2, 4, 3,
		
		spiralize(odd);
		// 1, 2, 3, 6, 9, 8, 7, 4, 5,
		
		spiralize(evenBigger);
		// 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10,
	}
	
	public static void spiralize(int[][] input){
		
		int outerDimension = input.length - 1;
		int originalOuterDimension = outerDimension;
		int size = input.length;
		
		while(outerDimension > 0){
			
			//account for final number in the middle
			if(outerDimension == 1 && size % 2 == 1){
				System.out.print(input[size / 2][size / 2] + ", ");
				break;
			}
			
			//top
			int topStart = originalOuterDimension - outerDimension;
			for(int top = topStart; top < outerDimension; top++){
				System.out.print(input[topStart][top] + ", ");
			}
			//right
			int rightStart = originalOuterDimension - outerDimension;
			for(int right = rightStart; right < outerDimension; right++){
				System.out.print(input[right][outerDimension] + ", ");
			}
			
			//bottom
			int bottomStart = outerDimension;
			for(int bottom = bottomStart; bottom > originalOuterDimension - outerDimension; bottom--){
				System.out.print(input[outerDimension][bottom] + ", ");
			}
			
			//left
			int leftStart = outerDimension;
			for(int left = leftStart; left > originalOuterDimension - outerDimension; left--){
				System.out.print(input[left][originalOuterDimension - outerDimension] + ", ");
			}
			
			outerDimension--;
			
			
		}
		
		System.out.println("");
		
	}


}