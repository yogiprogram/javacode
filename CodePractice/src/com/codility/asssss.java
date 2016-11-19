package com.codility;

//you can also use imports, for example:
//import java.util.*;
import java.util.HashMap;
//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class asssss {

	public static void main(String[] args) {
		int A[] = { 1, 2, 4, 5, 7, 29, 30 };
		System.out.println(new BarclayCard().solution(A));
	}

	public int solution(int[] A) {
		HashMap<String, Integer> tempCache = new HashMap<String, Integer>();
		return findMinimumAmount(A, 0, A.length, tempCache);
	}

	int oneDayTicketCost = 2;
	int weeklyTicketCost = 7;
	int monthlyTicketCost = 25;
	int minthreshold = 4;

	private int findMinimumAmount(int[] days, int start, int end, HashMap<String, Integer> tempCache) {

		// if travel less than 4
		if ((end - start) < minthreshold) {
			return (end - start) * oneDayTicketCost;
		}

		int minTotal = (end - start) * oneDayTicketCost;
		if (monthlyTicketCost < minTotal)
			minTotal = monthlyTicketCost;

		for (int i = 0; i < (end - start); i++) {
			int total = 0;
			total += findMinimumAmount(days, start, start + i, tempCache);
			total += weeklyTicketCost;

			// while 7 days
			int countToSeven = 0;
			while ((start + i + countToSeven) < end && days[start + i + countToSeven] - days[start + i] < 7
					&& countToSeven < 7) {
				countToSeven++;
			}
			total += findMinimumAmount(days, start + i + countToSeven, end, tempCache);
			// if total is less than min total
			if (total < minTotal)
				minTotal = total;
		}
		return minTotal;
	}
}