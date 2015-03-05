package com.data;

public class DoublyLinkedList {

	NodeDD root; 
	public DoublyLinkedList(){
		root = null;
		
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
				
		DoublyLinkedList dList = new DoublyLinkedList();
		dList.addNodeAtEnd("Ashish");
		dList.addNodeAtEnd("Ishjyot");

		dList.displayList();		
			
			
		
		
	}
	
	
	
	
	
	
	public void displayList(){
		NodeDD cur = root;
		
		while(cur != null){
			
			System.out.println("NodeDD : " + cur.data);
			cur = cur.next;
			
			
		}
		
		
		
		
		
	}
	
	public void addNodeAtEnd(String str){
		NodeDD newNode = new NodeDD();
		newNode.data = str;
		
		if(root == null){
			root = newNode;	
			root.next = null;
			root.prev = null;
			return;
		}
		else if(root.next == null && root.prev == null){
			root.next = newNode;
			newNode.prev = root;
			
		}
		else{
			NodeDD cur = root;
			
			while(cur.next!=null){
				
				cur = cur.next;
				
			}
			
			if(cur.next == null){
				
				cur.next = newNode;
				newNode.prev = cur;
				
			}
			
			
			
		}
		
		
	}
	
	
	
	
	
}

class NodeDD{
NodeDD prev; 
NodeDD next;
String data;

public NodeDD(){
	prev = null;
	next = null;
	data = "";
	
}

public NodeDD getPrev() {
	return prev;
}

public void setPrev(NodeDD prev) {
	this.prev = prev;
}

public NodeDD getNext() {
	return next;
}

public void setNext(NodeDD next) {
	this.next = next;
}

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}





}