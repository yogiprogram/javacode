package com.codility;

public class MissingInteger {

	public int solution(int[] A) {
	    int max = A.length;
	    int threshold = 1;
	    boolean[] bitmap = new boolean[max + 1];

	    //populate bitmap and also find highest positive int in input list.
	    for (int i = 0; i < A.length; i++) {
	        if (A[i] > 0 && A[i] <= max) {
	            bitmap[A[i]] = true;
	        }

	        if (A[i] > threshold) {
	            threshold = A[i];
	        }
	    }

	    //find the first positive number in bitmap that is false.
	    for (int i = 1; i < bitmap.length; i++) {
	        if (!bitmap[i]) {
	            return i;
	        }
	    }

	    //this is to handle the case when input array is not missing any element.
	    return (threshold+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
