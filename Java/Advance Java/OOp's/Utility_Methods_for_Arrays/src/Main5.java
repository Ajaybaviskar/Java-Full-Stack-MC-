// Comparing Arrays with Arrays.equals()

import java.util.Arrays;

public class Main5 {
	public static void main(String args[]) {
		int[] array1 = {1,2,3};
		int[] array2 = {1,2,3};
		boolean isEqual=Arrays.equals(array1, array2);
		
		System.out.println(isEqual);
	}

}
