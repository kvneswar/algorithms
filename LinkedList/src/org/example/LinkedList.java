package org.example;

public class LinkedList {

	private Node head;

	public void insertAtHead(int data){
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}
	
	public void deleteFromHead(){
		if(head != null){
			head = head.getNextNode();
		}
	}

	public int size(){
		int counter=0;
		Node current = this.head;
		while(current != null){
			counter++;
			current = current.getNextNode();
		}
		
		return counter;
	}
	
	public Node find(int data){
		Node current = this.head;
		while(current != null){
			if(current.getData() == data){
				return current;
			}
			current = current.getNextNode();
		}
		return null;
	}
	
	@Override
	public String toString() {
		String result = "{ ";
		Node current = this.head;
		while(current != null){
			result += current.toString()+", ";
			current = current.getNextNode();
		}
		result += " }";
		return result;
	}
	
}

class Node{
	
	private int data;
	private Node nextNode;
	
	public Node(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		return "data = " + data;
	}
	
}
