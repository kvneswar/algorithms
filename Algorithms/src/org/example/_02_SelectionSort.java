package org.example;

public class _02_SelectionSort {
	
	// Select the smallest number and swap it with the next largest element.
	
	public static void main(String[] args) {
		Integer[] numbers = {8, 6, 4, 2};
		int position=0;
		for(int outerLoopCounter=0; outerLoopCounter<numbers.length; outerLoopCounter++){
			int tmp = numbers[outerLoopCounter];
			position = outerLoopCounter;
			for(int innerLoopCounter=outerLoopCounter; innerLoopCounter<numbers.length; innerLoopCounter++){
				if(tmp > numbers[innerLoopCounter]){
					tmp = numbers[innerLoopCounter];
					position = innerLoopCounter;
				}
			}
			numbers[position] = numbers[outerLoopCounter];
			numbers[outerLoopCounter]=tmp;
		}
		System.out.println("Done!!!");
	}
}
