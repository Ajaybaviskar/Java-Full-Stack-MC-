// Dealing With Null Values in Arrays
public class Main9 {
	public static void main(String args[])
	{
		Integer[] array= {1,null,3}; 
		try
		{
			System.out.println(array[1].toString()); 
		}
		catch(NullPointerException e) 
		{
			e.printStackTrace();
		}		
	}
}
