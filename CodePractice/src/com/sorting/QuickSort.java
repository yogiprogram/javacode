package com.sorting;

public class QuickSort {

	static int[] array = { 12, 51, 9, 5, 3, 8, 4 };

	public static void main(String[] args) {

		System.out.print("Display array before sorting: ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

		quickSort(0, array.length - 1);

		System.out.print("\nDisplay array after sorting: ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

	}

	private static void quickSort(int left, int right) {

		if ((right - left) <= 0) {
			return;
		} else {
			int pivot = array[left];
			int partition = partitionArray(pivot, left, right);
			quickSort(left, partition - 1);
			quickSort(partition, right);

		}
	}

	private static int partitionArray(int pivot, int left, int right) {
		// left < pivot right
		int tr = right;
		while (left <= right) {

			while (array[left] < pivot) {
				left++;
			}

			while (array[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left++;
				right--;
			}
		}
		
		int temp = array[left];
		array[left] = array[tr];
		array[tr] = temp;
		
		return left;
	}

}
