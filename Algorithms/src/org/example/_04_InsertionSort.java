package org.example;

public class _04_InsertionSort {

	public static void main(String[] args) {

		int[] numbers = {2, 8, 1, 5};
		int current = 0;
		int j = 0;
		for(int loopCounter=0; loopCounter<=numbers.length-1; loopCounter++){
			current = numbers[loopCounter]; 
			j=loopCounter-1;
			while(j>=0 && numbers[j]>current){
				numbers[j+1]=numbers[j];
				j=j-1;
			}
			numbers[j+1]=current;
		}
		System.out.println("Done!!!");
	}
	
	/*	
		-> 1
		numbers: [1]
		-> 2
		numbers: [1, 2]
		-> 5
		numbers: [1, 2, 5]
	*/	
}
