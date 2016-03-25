package com.codility;

//https://codility.com/demo/results/trainingRU6VDC-GGZ/

public class BinaryGap {

	public int solution(int N) {
		String binary = Integer.toString(N, 2);
		int seq = 0;
		int result = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '0') {
				seq += 1;
			} else {
				if (result < seq)
					result = seq;
				seq = 0;
			}

		}
		return result;
	}

	public static void main(String[] args) {
		// int A[] = { 2, 3, 2, 3, 2 };
		int N = 9;
		System.out.println(new BinaryGap().solution(N));
	}

}
