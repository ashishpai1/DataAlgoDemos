package com.data;

public class StackUsingLinkedList {

	
	StackUsingLinkedList(){
		root = null;
		
		
	}
	
	Node root;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StackUsingLinkedList stack = new StackUsingLinkedList();
			stack.push(4);
			stack.push(5);
			stack.displayAllNodes();
			System.out.println(stack.pop());
			
	}
	
	
	
	// Display all nodes....
		public void displayAllNodes() {
			System.out.println("-----------Lets print the linked list------------");

			Node cur = root;
			while (cur != null) {

				System.out.println("Node : " + cur.data);
				cur = cur.next;

			}
		}

	
	
	
	public void push(int num){
		Node newNode = new Node(num);
		newNode.next = null;
		if (root == null) {

			root = newNode;
			return;
		} else if (root.next == null) {
			// second node
			root.next = newNode;
			return;

		} else {

			Node cur = root;
			Node prev = root;

			while (cur != null) {

				prev = cur;
				cur = cur.next;
			}

			prev.next = newNode;
		
		}

	}
		
		
		
	
	
	
	
	public int pop(){
		
		
		if(root == null){
			
			System.out.println("Nothing to pop...");
			return 0;
			
		}
		
		else if(root.next == null){
			int num = root.data;
			root = null;
			return num;
			
		}
		else{
			
			Node prev = root;
			Node cur = root;
			
			
			while(cur.next!=null){
				prev = cur;
				cur = cur.next;
				
				
			}
			
			
			int num = cur.data;
			prev.next = null;
			
			return num;
			
		}
		
		
		
		
		
		
		
	}
	
	
	public void displayList(){
		
		
		
	}
	

}




