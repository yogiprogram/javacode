package com.codility;

import java.util.HashMap;

public class FareCalculate {

	public static void main(String[] args) {
		// int A[] = { 1, 2, 4, 5, 7, 29, 30 };
		int A[] = { 1, 3, 20, 21, 22, 23, 23, 30 };
		System.out.println(new FareCalculate().solution(A));
	}

	public int solution(int[] A) {
		int sum = 0;
		if (A.length <= 3)
			return A.length * 3;

		for (int i = 0; i < A.length; i++) {

			// count 7 days
			int cout7day = 0;
			for (int j = i + 1; j < A.length; j++) {
				if (A[j - 1] + 1 == A[j] && cout7day <= 7){
					cout7day += 1;
					i = j;
				}else{
					break;
				}
			}
			
			if(cout7day*2 <= 6)
				sum += cout7day*2 ;
			if(cout7day == 7)
				sum += 7 ;
			
		}
		return sum;
	}

}
