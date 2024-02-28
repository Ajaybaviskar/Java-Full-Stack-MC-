import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Tata{
	void Tata_Details(String search , int budget) {
		String search1="tata";
		if(budget >400)
		{
			System.out.println("this is the tata details ");

		}
		else if(search.equals(search1)){
			System.out.println("thi/////////s is tata string");
			System.out.print(search);
		}
		else{
			System.out.println("You not choose right option"); 		

		}
		System.out.println(".........");		
	}
}
class Maruti extends Tata{
	void Maruti_Details(String search ,int budget){
		String search2="maruti";
		if(budget >400)
		{
			System.out.println("this is the maruti details ");

		}
		else if(search.equals(search2)){
			System.out.println("thi/////////s is maruti string");
			System.out.print(search);
		}
		else{
			System.out.println("You not choose right option"); 		

		}
		System.out.println(".........");	
		
	}
	
}
class Kia extends Maruti{
	void Kia_Details(String search,int budget){
		String search3="kia";
		if(budget >400)
		{
			System.out.println("this is the kia details ");

		}
		else if(search.equals(search3)){
			System.out.println("thi/////////s is kia string");
			System.out.print(search);
		}
		else{
			System.out.println("You not choose right option"); 		

		}
		System.out.println(".........");	
		

	}
	
}
public class CarShowRoom extends Kia {
	public static void main(String args[]) throws IOException
	{
		BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Press 1 For Tata");	
		System.out.print("Press 2 For Maruti")	;
		System.out.print("Press 3 For Kia :- ");
		int op=Integer.parseInt(Br.readLine());

		Tata obj =new Tata();
		Maruti obj1= new Maruti();

		String search="";
		int budget=0;

		switch (op) {
			case 1:
				System.out.println("Welcome To Tata");
				System.out.println("Press 1 For Budget :- ");
				System.out.println("Press 2 For Searching By Name :- ");
				
				int budget_op_tata=Integer.parseInt(Br.readLine());
				if(budget_op_tata==1){
					System.out.print("Enter Your Budget :- ");
					budget=Integer.parseInt(Br.readLine());
					obj.Tata_Details(search,budget);	
				}
				else if(budget_op_tata==2){
					System.out.print("Enter Car Name :- ");
					search=Br.readLine();
					obj.Tata_Details(search,budget);				
					
				}									
				break;
			case 2:
				System.out.println("Welcome To Maruti");
				System.out.println("Press 1 For Budget :- ");
				System.out.println("Press 2 For Searching By Name :- ");
				
				int budget_op_maruti=Integer.parseInt(Br.readLine());
				if(budget_op_maruti==1){
					System.out.print("Enter Your Budget :- ");
					budget=Integer.parseInt(Br.readLine());
					obj.Tata_Details(search,budget);
					obj1.Maruti_Details(search, budget);	
				}
				else if(budget_op_maruti==2){
					System.out.print("Enter Car Name :- ");
					search=Br.readLine();
					obj.Tata_Details(search,budget);				
					
				}	










				break;
		
			default:


				break;
		}	
		
	}
}