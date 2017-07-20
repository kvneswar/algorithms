package org.example;

public class _01_BubbleSort {

	public static void main(String[] args) {

		Integer[] numbers = {8, 6, 4, 2};
		int tmp = 0;
		for(int outerLoopCounter=0; outerLoopCounter<numbers.length-1; outerLoopCounter++){
			for(int innerLoopCounter=0; innerLoopCounter<numbers.length-1-outerLoopCounter; innerLoopCounter++){
				
				if(numbers[innerLoopCounter] > numbers[innerLoopCounter+1]){
					tmp = numbers[innerLoopCounter];
					numbers[innerLoopCounter] = numbers[innerLoopCounter+1];
					numbers[innerLoopCounter+1] = tmp;
				}
			}
		}
		System.out.println(numbers);

		/*
		 	8, 6, 4, 2
		 	6, 8, 4, 2
		 	6, 4, 8, 2
		 	6, 4, 2, 8

		 	4, 6, 2, 8
		 	4, 2, 6, 8

		 	2, 4, 6, 8

		 */

	}
}
