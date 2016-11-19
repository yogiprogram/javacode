package com.codility;

import java.util.HashMap;

public class BarclayCard {

	public int solution1(int[] A) {
		return 0;
	}

	public static void main(String[] args) {
		int A[] = {1, 3,20,21,22,23,23,30 };
		System.out.println(new BarclayCard().solution(A));
	}

	int oneDayTicket = 2;
	int weeklyTicket = 7;
	int monthlyTicket = 25;
	int threshold = 4;

	public int solution(int[] a) {
		HashMap<String, Integer> tempCache = new HashMap<String, Integer>();
		return findMinimumAmount(a, 0, a.length, tempCache);
	}

	private int findMinimumAmount(int[] days, int start, int end, HashMap<String, Integer> resultCache) {
		if (resultCache.containsKey(start + "_" + end)) 
			return resultCache.get(start + "_" + end);

		if (end - start < threshold) 
			// If number of travels are smaller than the Threshold then just buy single
			// tickets, skipped caching here...
			return (end - start) * oneDayTicket;

		// Options: All single tickets, a monthly ticket or some 7 day tickets.
		// We will pick the smallest one.
		int minTotal = (end - start) * oneDayTicket;
		if (monthlyTicket < minTotal)
			minTotal = monthlyTicket;

		// This is where the recursion happens. We will take each of the travel
		// days in order and buy a 7 day ticket on that day and calculate
		// [minimum amount for the previous days] + [7 day ticket amount] +
		// [minimum amount for the days after the 7 day ticket expires]
		// Finally, take the min of these
		for (int i = 0; i < end - start; i++) {
			int total = 0;

			total += findMinimumAmount(days, start, start + i, resultCache);
			// [minimum  amount  for  the  previous days]

			total += weeklyTicket; // [7 day ticket amount]
			int countToSeven = 0; // itarete the travel days until the 7 day
									// ticket expires
			while (start + i + countToSeven < end && days[start + i + countToSeven] - days[start + i] < 7
					&& countToSeven < 7) {
				countToSeven++;
			}

			total += findMinimumAmount(days, start + i + countToSeven, end, resultCache);
			// [minimum amount for  the  days after the  7  day  ticket  expires]

			if (total < minTotal)
				minTotal = total;
		}

		resultCache.put(start + "_" + end, minTotal);// Cache the result
		return minTotal;
	}
}
