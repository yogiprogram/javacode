import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Check word present in column row diagonal
 * 
 * @author New
 *
 */

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int noOfhotel = sc.nextInt();
		HashMap<Integer, Integer> review = new HashMap<>();
		String arrayWord[] = word.split(" ");
		Set<String> setOfWord = new HashSet<String>(Arrays.asList(arrayWord));
		for (int t = 0; t < noOfhotel; t++) {
			int hotelID = sc.nextInt();
			sc.next();
			String reviewq = sc.nextLine();
			reviewq = reviewq.replace(".", "").replace(",", "");
			System.out.println("\n" + reviewq);
			String rewiew[] = reviewq.split(" ");
			int count = 0;
			for (String wordForreview : rewiew) {
				if (setOfWord.contains(wordForreview)) {
					count++;
				}
			}
			if (review.get(hotelID) == null)
				review.put(hotelID, count);
			else
				review.put(hotelID, review.get(hotelID) + count);
		}
		System.out.println(review.toString());
	}

	public static int getShapeOfObject(int a, int b, int c, int d) {
		if ((a == b) && (b == c) && (c == d) && (d == a)) {
			return 1;
		} else if ((a == c) && (b == d)) {
			return 2;
		} else {
			return 3;
		}
	}

	public static void main22(String[] args) {
		int s = 0, r = 0, o = 0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input;
			while ((input = br.readLine()) != null) {
				String array[] = input.split(" ");
				int value = getShapeOfObject(Integer.parseInt(array[0]), Integer.parseInt(array[1]),
						Integer.parseInt(array[2]), Integer.parseInt(array[3]));
				// System.out.println(value);
				if (value == 1)
					s++;
				else if (value == 2)
					r++;
				else
					o++;
			}
			System.out.println(s + " " + r + " " + o);
		} catch (IOException io) {
			io.printStackTrace();
		}

	}

	public static int word_count(int input1, String[] input2, String input3) {
		String[][] array = new String[input1][input1];

		for (int i = 0; i < input1; i++) {
			System.out.println();
			String[] temp = input2[i].split("#");
			for (int j = 0; j < input1; j++) {
				array[i][j] = temp[j];
				System.out.print(" " + array[i][j]);
			}
		}
		System.out.println();
		int count = 0;
		String diagonalStr = "";
		String diagonalStr2 = "";
		int total = input1 - 1;
		for (int i = 0; i < input1; i++) {
			String rowStr = "";
			String colStr = "";
			for (int j = 0; j < input1; j++) {
				rowStr += array[i][j];
				colStr += array[j][i];
				if (i == j) {
					diagonalStr += array[i][j];
					diagonalStr2 += array[i][total];
					total--;
				}
			}
			// System.out.println("\nrowStr "+ rowStr);
			// System.out.println("colStr "+ colStr);
			if (rowStr.contains(input3)) {
				count += 1;
			}
			if (colStr.contains(input3)) {
				count += 1;
			}
		}
		if (diagonalStr.contains(input3)) {
			count += 1;
		}
		if (diagonalStr2.contains(input3)) {
			count += 1;
		}

		return count;
	}

	/**
	 * @param args
	 */
	public static void main1(String[] args) {
		// {E#D#E#E#E,D#I#S#K#E,E#S#E#E#E,E#C#E#E#E,E#E#E#E#E}
		// {A#A#K,A#S#K,A#K#K},
		/*
		 * int n = 3; String[] input2 = { "A#A#K", "A#S#K", "A#K#K" }; String
		 * input3 = "ASK";
		 */
		int n = 4;
		String[] input2 = { "E#D#E#E#E", "D#I#S#K#E", "E#S#E#E#E", "E#C#E#E#E", "E#E#E#E#E" };
		String input3 = "DIS";
		word_count(n, input2, input3);

	}
}
