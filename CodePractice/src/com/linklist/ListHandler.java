package com.linklist;

public class ListHandler {

	ListNode root;

	private void insert(int data) {
		ListNode newObj = new ListNode();
		newObj.data = data;
		if (root == null) {
			root = newObj;
		} else {
			ListNode cuNode = root;
			while (cuNode.next != null) {
				cuNode = cuNode.next;
			}
			cuNode.next = newObj;
		}

	}

	private void display() {
		ListNode current = root;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	private void reverse1() {
 	}
	
	
	private void reverse() {
		ListNode current = root;
		ListNode prev = null;
		ListNode next = null;
		int count = 0 ;
		while(current != null && count < 3){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count ++;
		}
		//prev.next = next;
		root = prev;
		
	}

	public static void main(String[] args) {
		ListHandler listHandler = new ListHandler();
		listHandler.insert(10);
		listHandler.insert(20);
		listHandler.insert(30);
		listHandler.insert(40);
		listHandler.insert(50);
		listHandler.insert(60);
		listHandler.display();
		System.out.println("\nAfter Reverse");
		listHandler.reverse();
		listHandler.display();
	}

}
