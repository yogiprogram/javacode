package com.sorting;

public class MergeSort {
	static int[] array = { 12, 51, 9, 5, 3, 8, 4 };

	public static void main(String[] args) {

		System.out.print("Display array before sorting: ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

		mergeSort(0, array.length - 1);

		System.out.print("\nDisplay array after sorting: ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

	}

	private static void mergeSort(int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(left, mid);
			mergeSort(mid + 1, right);
			merge(left, mid, right);
		}
	}

	private static void merge(int l, int m, int r) {
		int i, j, k;
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (i = 0; i < n1; i++) {
			L[i] = array[l + i];
		}
		for (j = 0; j < n2; j++) {
			R[j] = array[m + 1 + j];
		}

		i = 0;
		j = 0;
		k = l;

		while (i < n1 && j < n2) {
			if (L[i] < R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}

	}

}
