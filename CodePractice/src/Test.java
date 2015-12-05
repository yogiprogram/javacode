
/**
 * Check word present in column row diagonal 
 * @author New
 *
 */

public class Test {

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
					total --;
				}
			}
			//System.out.println("\nrowStr "+ rowStr);
			//System.out.println("colStr "+ colStr);
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
	public static void main(String[] args) {
		// {E#D#E#E#E,D#I#S#K#E,E#S#E#E#E,E#C#E#E#E,E#E#E#E#E}
		// {A#A#K,A#S#K,A#K#K},
		/*int n = 3;
		String[] input2 = { "A#A#K", "A#S#K", "A#K#K" };
		String input3 = "ASK";*/
		int n = 4;
		String[] input2 = {"E#D#E#E#E","D#I#S#K#E","E#S#E#E#E","E#C#E#E#E","E#E#E#E#E"};
		String input3 = "DIS";
		word_count(n, input2, input3);

	}
}
