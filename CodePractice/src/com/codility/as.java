package com.codility;

//https://codility.com/c/feedback/4FBYEC-QG7
public class as {
	public int solution(int[] A) {
		if (A.length > 100 * 1000000) {
			return -1;
		}
		int max_diff = 0;
		boolean flag = false;
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				flag = false;
				if (i != j) {
					int a = A[i];
					int b = A[j];
					if (a > b) {
						if (isAdjacent(A, b, a)) {
							System.out.println("isAdjacent " + a + "," + b + "(" + i + "," + j + ")");
							flag = true;
						}
					} else if (b > a) {
						if (isAdjacent(A, a, b)) {
							System.out.println("1isAdjacent " + a + "," + b + "(" + i + "," + j + ")");
							 flag = true;
						}
					}
					if (flag && (max_diff < Math.abs(a - b))) {
						max_diff = Math.abs(a - b);
						System.out.println(max_diff);
						flag = false;
					}
				}
			}
		}
		return max_diff;
	}

	private boolean isAdjacent(int[] A, int a, int b) {
		for (int i = a + 1; i < b; i++) {
			for (int n = 0; n < A.length; n++) {
				if (A[n] == i) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 3, 3, 7, 5, 3, 11, 1 };
		System.out.println(new as().solution(arr));
	}
}
