package com.sorting;

/*Algorithm
 //Sort an arr[] of size n
 insertionSort(arr, n)
 Loop from i = 1 to n-1.
 ……a) Pick element arr[i] and insert it into sorted sequence arr[0…i-1]

 Example:
 12, 11, 13, 5, 6

 Let us loop for i = 1 (second element of the array) to 5 (Size of input array)

 i = 1. Since 11 is smaller than 12, move 12 and insert 11 before 12
 11, 12, 13, 5, 6

 i = 2. 13 will remain at its position as all elements in A[0..I-1] are smaller than 13
 11, 12, 13, 5, 6

 i = 3. 5 will move to the beginning and all other elements from 11 to 13 will move one position ahead of 
 their current position.
 5, 11, 12, 13, 6

 i = 4. 6 will move to position after 5, and elements from 11 to 13 will move one position ahead of 
 their current position.
 5, 6, 11, 12, 13

 */

public class InsertionSort {

	public static void main(String[] args) {
		// int a[] = { 33, 55, 11, 2, 33, 5, 4 };
		int a[] = { 0, 1, 0, 1, 1, 0, 1 };

		/*for (int i = 1; i < a.length - 1; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}

			a[j + 1] = key;
		}*/

		for (int i = 0; i < a.length; i++) {
			for (int j = i ; j > 0 && a[j] < a[j-1]; j--) {
				int t = a[j];
				a[j] = a[j-1];
				a[j-1] = t;
			}
		}
		 
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(" " + a[i]);

		}

	}

}
