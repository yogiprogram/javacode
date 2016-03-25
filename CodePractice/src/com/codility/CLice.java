package com.codility;

public class CLice {

	public static void main(String[] args) {
		int arr[] = { 5, -7, 3, 5, -2, 4, -1 };
		
		int A[] = {23171 ,21011 ,21123 ,21366 ,21013, 21367 }; 
		System.out.println(new CLice().solution(A));
	}
	private int solution(int[] A) {
		int N = A.length;
		for (int i = N - 1; i > 0; i--) {
            A[i] = A[i] - A[i - 1];
        }
		A[0] = 0;
		int maxending = 0, maxSlicee = 0;
		for (int i = 0; i < A.length; i++) {
			maxending = Math.max(0, maxending + A[i]);
			maxSlicee = Math.max(maxending, maxSlicee);
			System.out.println(maxending + "   " + maxSlicee);
		}
		return maxSlicee;
	}
}
