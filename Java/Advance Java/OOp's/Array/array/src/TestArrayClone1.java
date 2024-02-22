// Cloning an Array in Java
public class TestArrayClone1 {
	public static void main(String args[])
	{
		int arr[]= {22,3,5};
		System.out.println("printing original array");
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("printing clone of the Array");
		int carr[]=arr.clone();
		for(int i:carr) {
			System.out.println(i);			
		}
		System.out.println("Are both Equal");
		System.out.println(arr==(carr));
	}

}
