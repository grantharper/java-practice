package com.practice;

import java.util.Arrays;
import java.util.List;

public class HighestProduct {

	public static void main(String[] args) {
		int[] input = { 3, 6, 2, 5, 9 };
		System.out.println(bruteForceHighestProduct(input));

		int[] arr = new int[] { 1, 10, -5, 1, -100 };
		
		System.out.println("The brute force result is: " + bruteForceHighestProduct(arr));
		
		System.out.println("The result is: " + arrayProductOf3(arr));

		Integer[] fancy = new Integer[] { 1, 10, -5, 1, -100 };
		System.out.println("The result is: " + listProductOf3(fancy));

		//solution on web
		System.out.println("Web solution is: " + highestProductOf3(arr));
		

	}
	
	private static int[] swapAndSort(int[] target, int replacement, boolean negatives){
		
		//assume they will always be in order coming in
		if(negatives){
			if(replacement < target[1]){
				target[1] = replacement;
			}else{
				target[0] = replacement;
			}
		}else{
			if(replacement > target[1]){
				target[1] = replacement;
			}else{
				target[0] = replacement;
			}
			
		}
		
		
		
		return target;
	}
	
	private static int[] allocate(int[] target, int replacement, int count, boolean negative){
		
		if(count == 0){
			target[1] = replacement;
		}else{
			if(negative){
				if(target[1] < replacement){
					target[0] = replacement;
				}else{
					target[0] = target[1];
					target[1] = replacement;
				}
			}else{
				if(target[1] > replacement){
					target[0] = replacement;
				}else{
					target[0] = target[1];
					target[1] = replacement;
				}
			}
		}
		
		return target;
	}
	
	private static int arrayProductOf3(int[] input){
		
		int[] highest = new int[2];
		int[] lowest = new int[2];
		
		//initialized
		boolean lowestMissing = true;
		int lowestMissingCount = 0;
		boolean highestMissing = true;
		int highestMissingCount = 0;
		
		int highestProduct = 0;
		
		for (int i = 0; i < input.length; i++) {
			
			if(!highestMissing && input[i] * highest[0] * highest[1] > highestProduct){
				highestProduct = input[i] * highest[0] * highest[1];
			}
			if(!lowestMissing && input[i] * lowest[0] * lowest[1] > highestProduct){
				highestProduct = input[i] * lowest[0] * lowest[1];
			}
			
			if(input[i] < 0){
				if(lowestMissing){
					lowest = allocate(lowest, input[i], lowestMissingCount, true);
					lowestMissingCount++;
					if(lowestMissingCount == 2) lowestMissing = false;
					//continue;
				}else if(input[i] < lowest[0]){
					lowest = swapAndSort(lowest, input[i], true);
				}
			}else{
				//input is greater than or equal to 0
				if(highestMissing){
					highest = allocate(highest, input[i], highestMissingCount, false);
					highestMissingCount++;
					if(highestMissingCount == 2) highestMissing = false;
					//continue;
				}else if(input[i] > highest[0]){
					highest = swapAndSort(highest, input[i], false);
				}
			}	
			
			
			
		}
		
		if(!lowestMissing && highest[1] * lowest[0] * lowest[1] > highestProduct){
			highestProduct = highest[1] * lowest[0] * lowest[1];
		}
		
		return highestProduct;
	}

	private static Integer listProductOf3(Integer[] fancy) {
		
		List<Integer> list = Arrays.asList(fancy);
		
		list.sort(null);
		
		
		//lowest two multiplied by highest
		Integer lowestHighestProduct = list.get(0) * list.get(1) * list.get(list.size() - 1);
		//highest three
		Integer highestHighestProduct = list.get(list.size()-1) * list.get(list.size()-2) * list.get(list.size()-3);
		
		if(lowestHighestProduct > highestHighestProduct){
			return lowestHighestProduct;
		}else{
			return highestHighestProduct;
		}
		
	}

	public static int bruteForceHighestProduct(int[] input) {
		// will always have 3 numbers guaranteed
		int result = input[0] * input[1] * input[2];

		for (int i = 0; i < input.length; i++) {

			for (int j = i + 1; j < input.length; j++) {

				for (int k = j + 1; k < input.length; k++) {
					int temp = input[i] * input[j] * input[k];
					if (temp > result) {
						result = temp;
					}
				}

			}

		}

		return result;
	}

	public static int horribleHighestProductOf3(int[] input) {

		int[] lowest2 = new int[2];

		int[] highest2 = new int[2];

		int highestProduct = input[0] * input[1] * input[2];

		for (int i = 0; i < input.length; i++) {

			if (input[i] < 0) {
				if (lowest2[0] == 0 || lowest2[1] == 0) {
					if (lowest2[0] == 0) {
						lowest2[0] = input[i];
					} else if (lowest2[1] == 0) {
						lowest2[1] = input[i];
					}
				} else {
					if (input[i] < lowest2[0]) {
						lowest2[0] = input[i];
					} else if (input[i] < lowest2[1]) {
						lowest2[1] = input[i];
					}
				}

			} else {
				if (highest2[0] == 0 || highest2[1] == 0) {
					if (highest2[0] == 0) {
						highest2[0] = input[i];
					} else if (highest2[1] == 0) {
						highest2[1] = input[i];
					}
				} else {
					if (input[i] > highest2[0]) {
						highest2[0] = input[i];
					} else if (input[i] < highest2[1]) {
						highest2[1] = input[i];
					}
				}
			}

			// ensure everything has been initialized
			if (lowest2[0] != 0 && lowest2[1] != 0) {
				if (input[i] * lowest2[0] * lowest2[1] > highestProduct) {
					highestProduct = input[i] * lowest2[0] * lowest2[1];
				}
			}
			if (highest2[0] != 0 && highest2[1] != 0) {
				if (input[i] * highest2[0] * highest2[1] > highestProduct) {
					highestProduct = input[i] * highest2[0] * highest2[1];
				}
			}
		}

		return highestProduct;

	}

	
	public static int highestProductOf3(int[] arrayOfInts) {
	    if (arrayOfInts.length < 3) {
	        throw new IllegalArgumentException("Less than 3 items!");
	    }

	    // We're going to start at the 3rd item (at index 2)
	    // so pre-populate highests and lowests based on the first 2 items.
	    // we could also start these as null and check below if they're set
	    // but this is arguably cleaner
	    int highest = Math.max(arrayOfInts[0], arrayOfInts[1]);
	    int lowest  = Math.min(arrayOfInts[0], arrayOfInts[1]);

	    int highestProductOf2 = arrayOfInts[0] * arrayOfInts[1];
	    int lowestProductOf2  = arrayOfInts[0] * arrayOfInts[1];

	    // except this one--we pre-populate it for the first *3* items.
	    // this means in our first pass it'll check against itself, which is fine.
	    int highestProductOf3 = arrayOfInts[0] * arrayOfInts[1] * arrayOfInts[2];

	    // walk through items, starting at index 2
	    for (int i = 2; i < arrayOfInts.length; i++) {
	        int current = arrayOfInts[i];

	        // do we have a new highest product of 3?
	        // it's either the current highest,
	        // or the current times the highest product of two
	        // or the current times the lowest product of two
	        highestProductOf3 = Math.max(Math.max(
	            highestProductOf3,
	            current * highestProductOf2),
	            current * lowestProductOf2);

	        // do we have a new highest product of two?
	        highestProductOf2 = Math.max(Math.max(
	            highestProductOf2,
	            current * highest),
	            current * lowest);

	        // do we have a new lowest product of two?
	        lowestProductOf2 = Math.min(Math.min(
	            lowestProductOf2,
	            current * highest),
	            current * lowest);

	        // do we have a new highest?
	        highest = Math.max(highest, current);

	        // do we have a new lowest?
	        lowest = Math.min(lowest, current);
	    }

	    return highestProductOf3;
	}
}
