// handling ArrayIndexOutOfBoundsException
public class Main8 {
	public static void main(String args[]) {
		int[] array = {1,2,3};
		try {
			System.out.println(array[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
		
	}

}
