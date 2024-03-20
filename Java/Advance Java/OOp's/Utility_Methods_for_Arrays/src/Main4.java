// copying Array with Arrays.copyOf() 

import java.util.Arrays;

public class Main4 {
	public static void main(String args[]) {
		int[] original = {1,2,3};
		int[] copy=Arrays.copyOf(original, original.length);
		
//		System.out.println(Arrays.toString(copy));
		String str=copy.toString();
		// let's check is String or not 
		if(str instanceof java.lang.String) {
			System.out.println("this is String");
		}
	}

}
