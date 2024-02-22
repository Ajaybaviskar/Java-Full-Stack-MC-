
public class TestAnonymousArray {
	static void PrintArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[])
	{
		PrintArray(new int[] {1,2,3});
		
	}

}
