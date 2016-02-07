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
public class TapeEquilibrium {
	public int solution(int[] A) {
		int[] diff;
		int sum1;
		int sum2 = 0;
		int localMin;
		diff = new int[A.length - 1];

		// AT P=1 sum1=A[0]
		sum1 = A[0];

		for (int i = 1; i < A.length; i++) {
			sum2 += A[i];
		}

		for (int p = 1; p < A.length; p++) {
			localMin = Math.abs(sum1 - sum2);

			// advance the sum1, sum2
			sum1 += A[p];
			sum2 -= A[p];
			diff[p - 1] = localMin;
		}
		return (getMinVal(diff));
	}

	public int getMinVal(int[] arr) {
		int minValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

	public static void main(String[] args) {
		int A[] = { 13, 11, 12, 8, 13 };
		System.out.println(new TapeEquilibrium().solution(A));
	}
}
