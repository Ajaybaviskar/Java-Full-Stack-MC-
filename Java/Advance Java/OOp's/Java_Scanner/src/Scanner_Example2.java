import java.util.Scanner;
public class Scanner_Example2 {
	public static void main(String args[]) 
	{
		String str="Ajay Baviskar"; 
		// Create Scanner with the specified object 
		Scanner sc=new Scanner(str); 
		System.out.println("Boolearn Result : "+sc.hasNextBoolean()); 
		// Change the delimiter of this scanner
		sc.useDelimiter("/");
		// Printing the Tokenized String
		System.out.println("------- Tokenizes String -------"); 
		while(sc.hasNext()) 
		{
			System.out.println(sc.next());
		}
		// Display the new delimiter 
		System.out.println("Delimiter Used : "+sc.delimiter()); 
		sc.close();		
	}
}
