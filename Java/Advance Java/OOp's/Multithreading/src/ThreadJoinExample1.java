//The Join Method : InterrruptedExcetion
class ABCD extends Thread{
	Thread threadToInterrupt;
	// overriding the run() method
	public void run() {
		threadToInterrupt.interrupt();
	}
}

public class ThreadJoinExample1 {
	// main Method 
	public static void main(String args[]) {
		try {
			ABCD th1=new ABCD();
			th1.threadToInterrupt=Thread.currentThread();
			th1.start();
			th1.join();
		}
		catch(InterruptedException e) {
			System.out.println("The Exception has been caught"+e);
		}
	}

}
