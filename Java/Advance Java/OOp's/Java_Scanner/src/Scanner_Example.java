// Java Scanner
import java.util.Scanner; 
public class Scanner_Example {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name :- "); 
		String name=sc.nextLine();
		
		System.out.println("Name is : "+name); 
		sc.close();
	}

}
