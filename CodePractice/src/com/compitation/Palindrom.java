package com.compitation;

public class Palindrom {

	static int max (int x, int y) {
		return (x > y)? x : y; }
	
	static int lps(String str, int i, int j) {

		if (i == j)
			return 1;
		
		if(str.charAt(i) == str.charAt(j) && i+1 == j)
			return 2;
		
		if(str.charAt(i) == str.charAt(j) ){
			return lps(str, i+1, j-1)+2;
		}
		return max(lps(str, i, j-1), lps(str, i+1, j));
	}

	public static void main(String[] args) {
		String inString = "BBABCBCAB";
		System.out.println(lps(inString, 0, inString.length()-1));
	}

}
