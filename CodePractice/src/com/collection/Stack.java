package com.collection;

public class Stack {

	int top;
	int capacity = 100;
	int arr[] = new int[capacity];

	private void push(int value) throws Exception {

		if (top < capacity)
			throw new Exception("Capacity full");
		top++;
		arr[top] = value;
	}

	private int pop() throws Exception {
		if (top == 0)
			throw new Exception("Empty stack");
		int t = arr[top];
		top--;
		return t;
	}

	
	static java.util.Stack<Integer> as;

	public static void main(String[] args) {
		as = new java.util.Stack();
		as.add(1);
		as.push(1);
		as.pop();
		as.size();
	}
}
