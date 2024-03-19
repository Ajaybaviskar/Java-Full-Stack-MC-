// Thread Pool Methods Example : int enumerate()
// Now we will learn how one can use the enumerate() method in the code
import java.lang.*;
class ThreadNew extends Thread{
	// constructor of the class 
	ThreadNew(String tName,ThreadGroup tg){
		super(tg,tName);
		start();
	}
	// run method 
	public void run() {
		for(int j=0;j<100;j++) {
			try {
				Thread.sleep(5);
			}
			catch(InterruptedException e) {
				System.out.println("The Exception has ben encounted "+e);
			}
		}
		System.out.println(Thread.currentThread().getName()+"thread has finished executis");
	}
}
public class EnumEX {
	public static void main(String args[]) {
		// creating the thread group
		ThreadGroup tg=new ThreadGroup("the parent group");
		ThreadGroup tg1=new ThreadGroup(tg,"the child group");
		ThreadNew th1=new ThreadNew("the first",tg);
		System.out.println("Starting the first...");
		
		ThreadNew th2=new ThreadNew("the second",tg);
		System.out.println("Starting the second...");
		
		// returning the number of threads kept in the array
		Thread[] grp=new Thread[tg.activeCount()];
		int cnt=tg.enumerate(grp);
		for(int j=0;j<cnt;j++) {
			System.out.println("Thread"+grp[j].getName()+"is found");
		}		
	}
}
