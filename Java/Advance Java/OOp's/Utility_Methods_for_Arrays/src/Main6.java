// Searching in Arrays With Arrays.binarySearch()
import java.util.Arrays;
public class Main6 {
	public static void main(String args[]) {
		int[] array = {1,2,3};
		int index=Arrays.binarySearch(array, 3); 
		System.out.println(index); //2 
	}

}
