
public class LinearSearch {

	
	private static int linearsearch(int[] array, int left, int right, int x) {
		
		if(right >= left){
			int mid = left + ( right - left) / 2;
			if(array[mid] == x)
				return mid;
			if(array[mid] > x )
				return linearsearch(array, left, mid-1, x);
			else
				return linearsearch(array, mid+1, right, x);
		}
		return -1;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {1,2,3,4,5,6,7,8,9,};
		
		int x = 8;
		
		System.out.println(linearsearch(array , 0 , array.length-1 , 8 ));
		

	}

}
