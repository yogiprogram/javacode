public class MatrixRoation {

	public static void main(String[] args) {
		int arr[][] = {{1,	2,	3,	4},
					   {0,	5,	6,	7},
					   {8,	9,	10,	11},
					   {12,	13,	14,	15}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print("\t" + arr[i][j]);
			}
			System.out.println();
		}
		rotate(arr, 4);
		System.out.println("=======================================\n");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print("\t" + arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void rotate(int[][] matrix, int n) {
		
		for (int layer = 0; layer < n/2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				
				int top = matrix[first][i];
				
				matrix[first][i] = matrix[last-offset][first];
				
				matrix[last-offset][first] = matrix[last][last - offset];

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];

				// top -> right
				matrix[i][last] = top; // right <- saved top

			}
			
		}
		
	}

}
