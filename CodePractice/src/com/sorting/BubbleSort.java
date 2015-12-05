package com.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 33, 55, 11, 2, 33, 5, 4 };
		// int a[] = { 0, 1, 0, 1, 1, 0, 1 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int aq = a[j + 1];
					a[j + 1] = a[j];
					a[j] = aq;
				}
			}

		}

		
		
		for (int i = 0; i < a.length ; i++) {
			System.out.print(" " + a[i]);

		}
	}

}
