package com.compitation;

public class PaliDP {

	// A utility function to get max of two integers
	static int max(int x, int y) {
		return (x > y) ? x : y;
	}

	static int lps(String[] input1) {

		String str = "";

		for (String string : input1) {
			str = str.concat(Character.toString(string.charAt(0)));
		}

		System.out.println(str);
		int n = str.length();
		int i, j, cl;
		int table[][] = new int[n][n];

		for (i = 0; i < n; i++)
			table[i][i] = 1;

		for (cl = 2; cl <= n; cl++) {
			for (i = 0; i < n - cl + 1; i++) {
				j = i + cl - 1;
				if (str.charAt(i) == str.charAt(j) && cl == 2)
					table[i][j] = 2;
				else if (str.charAt(i) == str.charAt(j))
					table[i][j] = table[i + 1][j - 1] + 2;
				else
					table[i][j] = max(table[i][j - 1], table[i + 1][j]);
			}
		}

		return table[0][n - 1];
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		String[] a = { "B", "B", "A", "B", "C", "B", "C", "A", "B" };
		System.out.println(lps(a));
	}
}
