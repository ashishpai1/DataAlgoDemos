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
		dList.addNodeAtEnd("Abc");
		//dList.displayList();		
		
	    dList.addNodeAtStart("yo yo");
	    dList.addNodeAtStart("Interno");
	    System.out.println("----------------------------------------");
		dList.displayList();		
	    System.out.println("----------------------------------------");
	   // dList.deleteLastNode();
	    
	    dList.deleteFirstNode();
	   
	    dList.insertAtPosition(3, "anuj");
		dList.displayList();		

		
	}
	
	
	
	
	
	
	public void displayList(){
		NodeDD cur = root;
		
		while(cur != null){
			
			System.out.println("NodeDD : " + cur.data);
			cur = cur.next;
			
			
		}
		
		
		
		
		
	}
	
	
	
	public void insertAtPosition(int pos, String str ){
		
		NodeDD newNode = new NodeDD();
		newNode.data = str;
		
		NodeDD cur = root;
		int count = 1;
		
		while(cur.next != null){
			if(count==pos){
				
				break;
			}
			
			count++;
			cur = cur.next;
			
			
		}
		
		
		
		if(count == pos){
			
		 (cur.prev).next = newNode;
		 newNode.prev = (cur.prev);
		 newNode.next = cur;
		 cur.prev = newNode;
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
    public void deleteFirstNode(){
		
    	if(root == null){
    		System.out.println("LinkedList empty. Cannot delete nodes. ");
    		return;
    	}
    	
    	
		if(root.next == null){
			root = null;
			return;
			
		}else{
			root = root.next;
		    root.prev = null; 
			
		}
		
    	
		
    	
    }	
	
	
	public void deleteLastNode(){
			NodeDD cur = root;
		

	    	if(root == null){
	    		System.out.println("LinkedList empty. Cannot delete nodes. ");
	    		return;
	    	}
	    	
			
			
			if(root.next == null){
				
				root = null;
				return;
			}
			
			
			while(cur.next!=null){
				cur = cur.next;
				
				
			}
			
			if(cur.next == null){
				(cur.prev).next = null;
				
			}
			
		
		
	}
	
	
	
	public void addNodeAtStart(String str){
		NodeDD newNode = new NodeDD();
		newNode.data = str;
		
		if(root == null){
			root = newNode;
			return;
			
		}else{
			NodeDD temp = root;
			
			root = newNode;
			root.next = temp;
			root.prev = null;
			temp.prev = root;
		
			
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