
public class NonRepeatElement {
	 public static void main(String[] args) {
	        int a[] = { 3, 4, 1, 3, 1, 7, 2, 2, 4 };
	 
	        System.out.println(nonRepeatingElement(a));
	    }
	 
	    private static int nonRepeatingElement(int[] a) {
	        int element = 0;
	 
	        for (int i = 0; i < a.length; i++) {
	            element  = element ^ a[i];
	            System.out.println(element);
	        }
	 
	        return element;
	    }
}
