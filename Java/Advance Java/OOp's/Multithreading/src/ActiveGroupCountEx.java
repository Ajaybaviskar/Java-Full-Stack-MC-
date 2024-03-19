import java.lang.*;
class ThreadNew extends Thread{
	// constructor of the class
	ThreadNew(String tName, ThreadGroup tg){
		super(tg ,tName);
		start();
	}
	// Overriding the run() method
	public void run() {
		for(int j=0;j<100;j++) {
			try {
				Thread.sleep(5);
			}
			catch(InterruptedException e) {
				System.out.println("The Exception has been encounted"+e);
				
			}
		}
		System.out.println(Thread.currentThread().getName()+"Thread has finished executing...");
	}	
}

public class ActiveGroupCountEx {
	public static void main(String args[]) {
		// main method
		// creating the thread group 
		ThreadGroup tg=new ThreadGroup("The parent group of thread");
		ThreadGroup tg1=new ThreadGroup(tg,"The Child Group");
		ThreadNew th1=new ThreadNew("the first ",tg);
		System.out.println("Starting the second"); 
		// checking the number of active thread by invoking the activeGroupCount() method
		
		
		System.out.println("The total number of active thread group are : "+tg.activeGroupCount());
		
		
		
		
		
	}

}
