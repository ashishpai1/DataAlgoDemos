package com.data;

public class LinkedList {
	Node root;

	LinkedList() {

		root = null;
	}

	public static void main(String args[]) {

		LinkedList list = new LinkedList();
		/*
		 * list.addNode(3); list.addNode(4); list.addNode(7); list.addNode(8);
		 */

		list.addSortedNode(8);
		list.addSortedNode(2);
		list.addSortedNode(11);
		list.addSortedNode(0);
		list.addSortedNode(99);

		System.out.println("Sorted linked list...");
		list.displayAllNodes();

		// System.out.println("Removing a node from the middle of the list...");
		// list.removeNode(7);
		// list.displayAllNodes();

		// System.out.println("Removing a node at the end of the list....");
		// list.removeNode(8);
		// list.displayAllNodes();

		// System.out.println("Removing first Node....");
		// list.removeNode(3);
		// list.displayAllNodes();
	}

	// Can remove first node, last node, middle node
	public void removeNode(int num) {

		Node cur = root;
		Node prev = root;

		// first node

		if (root.data == num && root.next == null) {
			root = null;
			return;
		}

		if (root.data == num && root.next != null) {
			root = root.next;
			return;
		}

		while (cur != null) {

			if (cur.data == num && cur.next == null) {

				prev.next = null;
				return;

			}

			if (cur.data == num && cur.next != null) {

				prev.next = cur.next;
				return;

			}
			prev = cur;
			cur = cur.next;
		}

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

	
	
	
	
	
	
	// Creating a sorted linkedList....
	public void addSortedNode(int num) {
		Node newNode = new Node(num);
		newNode.next = null;
		if (root == null) {

			root = newNode;
			root.next = null;
			return;
		} else if (root.next == null) {
			if (root.data < newNode.data) {
				root.next = newNode;
				return;
			} else {
				Node temp = root;
				root = newNode;
				root.next = temp;
				return;
			}

		} else {

			if (root.data > newNode.data) {
				Node temp = root;
				root = newNode;
				root.next = temp;
				return;
			}

			Node cur = root;
			Node prev = root;
			while ((newNode.data > cur.data)) {
				prev = cur;
				cur = cur.next;
				if (cur == null) {

					break;
				}
			}

			if (cur == null) {

				prev.next = newNode;
				return;

			}

			if (newNode.data < cur.data && cur != null) {
				// if(cur!=null){
				prev.next = newNode;
				newNode.next = cur;
				return;
			}

		}

	}

	// Add new node at the end of the list.. .
	public void addNode(int num) {
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
			return;
		}

	}

}

class Node {
	int data;
	Node next;

	Node() {
		next = null;
		data = 0;
	}

	Node(int num) {
		this.data = num;
		this.next = null;
	}

}