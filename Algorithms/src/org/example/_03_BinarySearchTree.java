package org.example;

public class _03_BinarySearchTree {

	public static void main(String[] args) {
		_03_BinarySearchTree _03_BinarySearchTree = new _03_BinarySearchTree();
		int[] numbers = {2, 3, 4, 5, 6, 7};
		System.out.println(_03_BinarySearchTree.search(numbers, 0, numbers.length-1, 1));
	}

	private int search(int[] numbers, int lowerLimit, int upperLimit, int searchFor){

		int center = ((upperLimit-lowerLimit)/2)+lowerLimit;
		int result = 0;
		if(center >= numbers.length || center <0 
				|| lowerLimit >= numbers.length || lowerLimit <0  
				|| upperLimit >= numbers.length || upperLimit <0 ){
			throw new RuntimeException("Not Found !!!");
		}
		if(numbers[center] == searchFor){
			result = numbers[center];
		}else if(numbers[center] > searchFor){
			result = search(numbers, lowerLimit, center-1, searchFor);
		}else if(numbers[center] < searchFor){
			result = search(numbers, center+1, upperLimit, searchFor);
		}

		return result;
	}

}
