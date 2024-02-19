import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


abstract class Collection_info{
	abstract public void Car_info(int budget);	
}

class Ford extends Collection_info {
	public void Car_info(int budget) {
		if(budget>1000) {
			System.out.println("this is ford brand");
		}
		else if(budget<4000) {
			System.out.println("thisis ford");
			
		}
		else if(budget <500) {
			
		}
		else if(budget<1000) {
			
		}
		else{
			
		}
		
	}
	
}
class Toyota extends Collection_info{
	public void Car_info(int budget) {
		System.out.println("Toyota_fortner");
		
	}
}

public class CarShowRoom {
	public static void main(String args[]) throws NumberFormatException, IOException 
	{
		BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Select Which Compnay You Want ? ");
		System.out.println("1) For Endever");
		System.out.println("2) For Toyota Fortuner");
		
		int op=Integer.parseInt(Br.readLine());
		
		Collection_info obj=new Ford();

		
		switch(op) {
		case 1:
			System.out.println("Please Enter Budget For For Cars ");
			int budget=Integer.parseInt(Br.readLine());
			obj.Car_info(budget);
			break;
		default:
			System.out.println("Invlid Expression");
			break;
			
		
		}
		
		
		
		
		
		
	}
}
