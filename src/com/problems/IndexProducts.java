package com.problems;

public class IndexProducts {

	public static void main(String[] args) {
		
		int[] input = {1, 7, 3, 4};
		int[] result;
		result = productOfIndices(input);
		
		for(int r: result){
			System.out.println(r);
		}
		
		
		result = twoPassProduct(input);
		
		for(int r: result){
			System.out.println(r);
		}
	}

	
	
	public static int[] productOfIndices(int[] input) throws IllegalStateException{
		
		if(input == null || input.length < 3){
			throw new IllegalStateException();
		}
		
		int[] result = new int[input.length];

		
		for(int i = 0; i < input.length; i++){
			//assign all initial values to 1
			result[i] = 1;
			//numbers above
			for(int j = i + 1; j < input.length; j++){
				result[i] = result[i] * input[j];

			}
			//numbers below
			for(int k = i - 1; k > 0; k--){
				result[i] = result[i] * input[k];
			}
			
		}
		
		
		return result;
	}
	
	public static int[] twoPassProduct(int[] input)throws IllegalStateException{
		
		if(input == null || input.length < 3){
			throw new IllegalStateException();
		}
		
		int[] result = new int[input.length];

		
		int productSoFar = 1;
		int i = 0;
		while(i < input.length){
			result[i] = productSoFar;
			productSoFar *= input[i];
			i++;
		}
		
		productSoFar = 1;
		i = input.length - 1;
		
		while(i >= 0){
			result[i] *= productSoFar;
			productSoFar *= input[i];
			i--;
		}		
		
		return result;
	}
}
