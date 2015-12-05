package com.sorting;

public class QuickSort2 {

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

		if (left < right) {
			int partition = partitionArray(array, left, right);
			quickSort(left, partition - 1);
			quickSort(partition, right);

		}
	}
	
	private static int partitionArray(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left - 1;
		for (int j = left; j <= right; j++) {
			if (arr[j] < pivot) {
				i++;
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		int t = arr[i + 1];
		arr[i + 1] = arr[right];
		arr[right] = t;
		return i + 1;
	}

	 
}