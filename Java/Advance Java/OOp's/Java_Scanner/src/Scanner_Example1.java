import java.util.Scanner;
public class Scanner_Example1 {
	public static void main(String args[]) {
		
		String s="Ajay Baviskar"; 
		// create scanner object and pass string in it 
		Scanner scan=new Scanner(s);
		// check if the Scanner has a token
		System.out.println("Boolean Result : "+scan.hasNext());
		// print the String 
		System.out.println("String :"+scan.nextLine()); 
		scan.close();
		
		System.out.println("----------- Enter Your Details -----------"); 
		Scanner in =new Scanner(System.in);
		
		System.out.println("Enter your name :- "); 
		String name=in.nextLine(); // next for String 
		System.out.println("Name : "+name); 
		
		System.out.println("Enter your age :- "); 
		int age=in.nextInt(); // nextInt for Integer 
		System.out.println("Age : "+age); 
		
		System.out.println("Enter your salary :- "); 		
		double salary=in.nextDouble(); 
		System.out.println("Salary : "+salary); 
		
		
		
		in.close();		
	}
}
