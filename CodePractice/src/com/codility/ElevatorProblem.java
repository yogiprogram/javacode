package com.codility;

public class ElevatorProblem {
	public static void main(String[] args) {

		int A[] = { 60, 80, 40 };
		int B[] = { 2, 3, 5 };
		int M = 5;
		int X = 2;
		int Y = 200;
		/*
		 * int A[] = { 40, 40, 100, 80, 20 }; int B[] = { 3, 3, 2, 2, 3 }; int M
		 * = 5; int X = 2; int Y = 200;
		 */
		System.out.println(new ElevatorProblem().solution(A, B, M, X, Y));
	}

	/*
	 * Y wt limit x capacity m floor
	 */
	private int solution(int[] a, int[] b, int m, int x, int y) {
		int count = 1;
		int tempCapacity = 0, tempWt = 0, i = 0;
		while (i < a.length) {
			if (tempCapacity != x && tempWt <= y) {
				tempWt += a[i];
				tempCapacity++;
				i++;
				count++;
			} else {
				--i;
				--count;
				tempCapacity = 0;
				tempWt = 0;
			}
		}
		return count;
	}

}
