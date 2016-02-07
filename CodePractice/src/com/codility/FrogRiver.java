package com.codility;

//https://codility.com/demo/results/trainingYVSJ9Q-MKF/


public class FrogRiver {
	public static void main(String[] args) {
		int A[] = { 11 , 3 , 1 , 4 ,2 , 3 , 5 ,4 };
		System.out.println(new FrogRiver().solution(5,A));
	}

	private int solution(int X, int[] A) {
		int steps = X;
		boolean[] bitmap = new boolean[steps + 1];
		for (int i = 0; i < A.length; i++) {
			if (!bitmap[A[i]]) {
				bitmap[A[i]] = true;
				steps--;
			}
			if (steps == 0)
				return i;
		}
		return -1;
	}
}
