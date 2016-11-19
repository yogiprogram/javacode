package com.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ZooPlus {

	public static void main(String[] args) {
		 int A [] = new int [8]; 
		    A[0] = 7;
		    A[1] = 3;
		    A[2] = 7;
		    A[3] = 3;
		    A[4] = 1;
		    A[5] = 3;
		    A[6] = 4;
		    A[7] = 1;
		    HashMap<Integer,Integer> place = new HashMap<>();
		    HashMap<Integer,Integer> values = new HashMap<>();
		    for (int i = 0; i < A.length; i++) {
		    	place.put(A[i], A[i]);
		    	values.put(A[i], A[i]);
			}
		    Set<Integer> value1 = values.keySet();
	    	List<Integer> value = new ArrayList<Integer>(value1);
		    int[] list = new int [values.size()+1]; 
		    for (int i = 0; i < A.length; i++) {
		    	
		    	int j = 0;
		    	for (Iterator iterator = value.iterator(); iterator.hasNext();) {
					Integer integer = (Integer) iterator.next();
					
					if(integer.equals(A[i]))
						break;
					j++;
				}
		    	list[ j] = i+1 ;
		    	if(!place.isEmpty() ){
		    		place.remove(values.get(A[i]));
		    		if(place.isEmpty()){
		    			Arrays.sort(list);
		    			System.out.println( list[0] - list[list.length-1] );
		    		}
		    	}


		    }
	}

	/*
	 * // you can also use imports, for example: // import java.util.*;
	 * 
	 * // you can write to stdout for debugging purposes, e.g. //
	 * System.out.println("this is a debug message");
	 * 
	 * class Solution { public String solution(String numb) { String result =
	 * ""; numb = numb.replaceAll("[^\\d.]", ""); int len = numb.length(); while
	 * (len > 0) { if (len >= 3) { len = numb.length(); if(len == 4 ){ result =
	 * result + numb.substring(0, 2) + "-"; numb = numb.substring(2); len =
	 * numb.length(); }else{ result = result + numb.substring(0, 3) ; numb =
	 * numb.substring(3); len = numb.length(); if(len > 0) result += "-"; } }
	 * else{ result += numb.substring(0, len); len = -1; }
	 * 
	 * } return result; } }
	 */

}
