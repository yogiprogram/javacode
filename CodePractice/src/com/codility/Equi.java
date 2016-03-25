package com.codility;

//https://codility.com/demo/results/demo5298VN-JN2/
public class Equi {
	 
		public int solution(int[] A) {
			if (A.length == 0)
				return -1;

			long sum = 0;

			for (int i = 0; i < A.length; i++){
				sum += A[i];
			}

			long left = 0;
			long right = sum;

			for (int j = 0; j < A.length; j++) {
				left += A[j];
				if (left == right)
					return j;
				right -= A[j];
			}

			return -1;
		}
	
	public static void main(String[] args) {
		//int A[] = { 2, 3, 2, 3, 2 };
		int A[] = {0, -2147483648, -2147483648};
		System.out.println(new Equi().solution(A));
	}
}
