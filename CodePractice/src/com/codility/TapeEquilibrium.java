package com.codility;

/*
 *  double
two elements
 
simple_positive
 
simple_negative
 
small_random
random small, length = 100
 
small_range
range sequence, length = ~1,000
 
 */
//https://codility.com/demo/results/trainingCKQNTN-38Y/
public class TapeEquilibrium {
	public int solution(int[] A) {
		if (A.length == 0)
			return 0;
		if (A.length == 1)
			return A[0];
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		int left = A[0];
		int right = sum - A[0];
		int min = 1000000;
		for (int i = 1; i < A.length; i++) {
			min = Math.min(min, Math.abs(left - right));
			left += A[i];
			right = sum - left;
		}
		return min;

	}

	public static void main(String[] args) {
		int A[] = { 13, 11, 12, 8, 13 };
		System.out.println(new TapeEquilibrium().solution(A));
	}
}
