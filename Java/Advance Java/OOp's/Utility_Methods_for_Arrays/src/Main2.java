import java.util.Arrays; 
// Filling Array with Arrays.fill() 

public class Main2 {
	public static void main(String ags[]) {
		int[] array=new int[5]; 
		Arrays.fill(array, 1); 
		
		for(int i:array) {
			System.out.println(i+"");
		}
	}

}
