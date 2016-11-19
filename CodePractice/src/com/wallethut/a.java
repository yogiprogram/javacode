package com.wallethut;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class a {

	// Solution 1
	public static ArrayList<int[]> isKthComplementary(int k, int[] inputArray) {
		ArrayList<int[]> comps = new ArrayList<int[]>();
		Map<Long, Integer> mapIndex = new HashMap<Long, Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			final long complValue = ((long) k) - inputArray[i];
			final int tempValue = mapIndex.containsKey(complValue) ? mapIndex.get(complValue) : 0;
			// map.put(complValue, tempValue + 1);
			mapIndex.put(complValue, i);
		}

		for (int i = 0; i < inputArray.length; i++) {
			final long value = inputArray[i];
			if (mapIndex.containsKey(value)) {
				comps.add(new int[] { i, mapIndex.get(value) });
				System.out.println(" (" + i + "," + mapIndex.get(value) + ") ");
			}
		}

		return comps;
	}

	// Solution 2
	static int isKthComplementary1(int k, int[] inputArray) {
		ArrayList<int[]> comps = new ArrayList<int[]>();
		// Map<Long, Integer> map = new HashMap<Long, Integer>();
		Map<Long, Integer> mapIndex = new HashMap<Long, Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			final long complValue = ((long) k) - inputArray[i];
			final int tempValue = mapIndex.containsKey(complValue) ? mapIndex.get(complValue) : 0;
			// map.put(complValue, tempValue + 1);
			mapIndex.put(complValue, i);
		}

		int counter = 0;
		for (int i = 0; i < inputArray.length; i++) {

			final long value = inputArray[i];
			// counter += map.containsKey(value) ? map.get(value) : 0;
			if (mapIndex.containsKey(value))
				System.out.println(" (" + i + "," + mapIndex.get(value) + ") ");
		}

		return counter;
	}

	public static void main(String[] args) {
		// example, let A = { 1, 5, 9 } with K = 10 we get the pairs (0, 2),
		// (2,0), and (1,1) and the result of the algorithm should be 3.
		//int arr[] = { 1, 5, 9 };
		//System.out.println(isKthComplementary(10, arr));
		
		String a1 = "abc";
		String a2 = "abc";
		
		a2="cde";
		
		System.out.println(a2);
	}
}
