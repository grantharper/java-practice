package com.problems;

public class AppleStock {

	public static void main(String[] args) {
		int[] stockPrices = {11, 7, 5, 8, 10, 9};
		stockPrices = new int[]{11, 10, 1, 8, 7};
		System.out.println(bestProfit(stockPrices));

	}
	
	
	public static int bestProfit(int[] stockPrices) throws IllegalStateException{
		
		if(stockPrices == null || stockPrices.length < 2){
			throw new IllegalStateException();
		}
		
		//initialize at first possible buy and sale
		int maxProfit = stockPrices[1] - stockPrices[0];
		//initialize minPrice at first price
		int minPriceSoFar = stockPrices[0];
		
		//only goes through the loop once (greedy)
		for(int i = 1; i < stockPrices.length; i++){
			if(stockPrices[i] - minPriceSoFar > maxProfit){
				maxProfit = stockPrices[i] - minPriceSoFar;
			}
			if(stockPrices[i] < minPriceSoFar){
				minPriceSoFar = stockPrices[i];
			}
		}
		
		
		return maxProfit;
		
	}

}
