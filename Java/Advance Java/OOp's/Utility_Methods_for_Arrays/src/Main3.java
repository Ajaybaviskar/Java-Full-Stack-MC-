import java.util.Arrays;
// converting Array to String With Arrays to String 


public class Main3 {
	public static void main(String args[]) {
		int[] array ={1,2,3,4,5}; 
		String array2=Arrays.toString(array);
		System.out.println(array2);
		
		if(array2 instanceof java.lang.String) {
			System.out.println(array2+" is"); 
		}
		else {
			System.out.println("another");
		}
		System.out.println(array.length);
		System.out.println(array2.length());
	}

}
