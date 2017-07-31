package org.example;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		linkedList.insertAtHead(5);
		linkedList.insertAtHead(10);
		linkedList.insertAtHead(15);
		linkedList.insertAtHead(20);
		linkedList.insertAtHead(25);
		linkedList.insertAtHead(30);
		
		System.out.println(linkedList);
		System.out.println("Size: "+linkedList.size());
		linkedList.deleteFromHead();
		System.out.println(linkedList);
		System.out.println("Size after deleting the element @ Head: "+linkedList.size());
		System.out.println("Find: "+linkedList.find(15));
	}

	
}
