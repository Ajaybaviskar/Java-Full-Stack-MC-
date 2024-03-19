// Thread Pool Method Example : void destroy()
import java.lang.*;
class ThreadNew extends Thread{
	ThreadNew(String tName, ThreadGroup tg){
		super(tg,tName);
		start();
	}
	// overriding the run() method 
	public void run() {
		for(int j=0;j<100;j++) {
			try {
				Thread.sleep(5);
			}
			catch(InterruptedException e) {
				System.out.println("The Exception has been encountered"+e);
			}
		}
		System.out.println(Thread.currentThread().getName()+"Thread has finished exceuting...");
	}	
}

public class DestroyEx {
	public static void main(String args[]) throws SecurityException, InterruptedException  {
		// creating the thread group 
		ThreadGroup tg=new ThreadGroup("The Parent Group ");
		ThreadGroup tg1=new ThreadGroup(tg,"The child group");
		
		ThreadNew th1=new ThreadNew("the first",tg);
		System.out.println("Staring the first"); 
		
		ThreadNew th2=new ThreadNew("the second",tg);
		System.out.println("starting the second...");
		// waiting until the other thread has 
		th1.join();
		th2.join(); 
		
		// destroying the child thread Group 
//		tg.destroy(); 
		System.out.println(tg.getName()+"is Destroy...");
	}

}
