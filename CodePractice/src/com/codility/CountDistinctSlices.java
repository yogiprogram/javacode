package com.codility;

public class CountDistinctSlices {
	public int solution(int M, int[] A) {
		int N = A.length;
		// the counter array for every element in the array A
		int[] counters = new int[M + 1];
		int head = 0;
		int tail = 0;
		int result = 0;
		while (tail < N) {
			// find the most right end of the array for each tail
			while (head < N && counters[A[head]] != 2) {
				counters[A[head]]++;
				if (counters[A[head]] == 2)
					break;
				head++;
			}
			result += head - tail;
			if (result > 1000000000)
				return 1000000000;
			// set the counter of the element before tail to be 0
			counters[A[tail]] = 0;
			tail++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int A[] = {3 , 4, 5, 5 , 2};
		System.out.println(new CountDistinctSlices().solution(6, A));
	}
}
