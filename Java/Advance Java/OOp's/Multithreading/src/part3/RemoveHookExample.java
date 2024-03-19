package part3;

public class RemoveHookExample {
	// the msg class is derived from the thread class 
	static class Msg extends Thread
	{
		public void run()
		{
			System.out.println("Bye...");
		}
	}
	// main method 
	public static void main(String args[]) {
		try 
		{
			Msg ms=new Msg();
			// registering the Msg object as the shutdown hook 
			Runtime.getRuntime().addShutdownHook(ms); 
			// printing the current state of program 
			System.out.println("The Program is begining...");
			// cacuisng the thread to sleep for see 
			System.out.println(2000);
			// removing the hook 
			Runtime.getRuntime().removeShutdownHook(ms);
			// printing the message program 
			System.out.println("The Program is terminated...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
