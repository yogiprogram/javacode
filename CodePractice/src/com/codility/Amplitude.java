package com.codility;

/*
The amplitude of a non-empty zero-indexed array A consisting of N numbers is defined as

amplitude(A) = max { A[P] - A[Q] : 0 <= P, Q < N }

Write a function

int amplitude(int[] A);

that given a non-empty zero-indexed array A consisting of N non-negative integers returns its amplitude. Assume that the length of the array does not exceed 1,000,000. Assume that each element of the array is a non-negative integer not exceeding 5,000,000.

For example, given array A such that

A[0]=10, A[1]=2, A[2]=44, A[3]=15, A[4]=39, A[5]=20

the function should return 42.

*/
public class Amplitude {

	public int solution1(int[] arr) {
		// write your code in Java SE 8
		int n = arr.length;
		if (n == 1) {
			return arr[0];
		} else if (n == 2) {
			return Math.abs(arr[1] - arr[0]);
		}
		int diff = arr[1] - arr[0];
		int curr_sum = diff;
		int max_sum = curr_sum;
		for (int i = 1; i < n - 1; i++) {
			// Calculate current diff
			diff = arr[i + 1] - arr[i];

			// Calculate current sum
			if (curr_sum > 0)
				curr_sum += diff;
			else
				curr_sum = diff;

			// Update max sum, if needed
			if (curr_sum > max_sum)
				max_sum = curr_sum;
		}

		return max_sum;
	}

	public static void main(String[] args) {
		  int arr[] = {1, 2, 6, 80, 100};
		  //int arr[] = {10, 2, 2, 15, 39, 20};
		//int arr[] = { 10, 2 };
		System.out.println(new Amplitude().solution(arr));
	}

	private int solution(int[] A) {

		int arr_size = A.length;
		if (arr_size == 1) {
			return A[0];
		} else if (arr_size == 2) {
			return Math.abs(A[1] - A[0]);
		}
		int max_diff = A[1] - A[0];
		int min_element = A[0];
		int i;
		for (i = 1; i < arr_size; i++) {
			if (A[i] - min_element > max_diff)
				max_diff = A[i] - min_element;
			if (A[i] < min_element)
				min_element = A[i];
		}
		return max_diff;
	}
}
