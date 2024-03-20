// Synchronized Block Example Using Anonymous Class 
// A sender class 
class Sender{
	public void SenderMsg(String msg) {
		System.out.println("\n Sending a Message : "+msg); 
		try {
			Thread.sleep(800);
		}
		catch(Exception e) {
			System.out.println("Thread in Inerrupted...");
		}
		System.out.println("\n"+msg+" send ");
	}
}
// A Sender class for sending a message Using Threads 
class SenderWThreads extends Thread{
	private String msg; 
	Sender sd; 
	// Receive method to receive a message object and a message to be sent. 
	SenderWThreads(String m, Sender obj){
		msg=m; 
		sd=obj; 
	}
	public void run() {
		// Checks that only one thread sends a message at a time 
		synchronized(sd) {
			// synchoroning the sender object 
			sd.SenderMsg(msg); 
		}
	}
}
// Driver code 
public class SynchronizedMultithreading {
	public static void main(String args[]) {
		Sender sender=new Sender(); 
		SenderWThreads sender1=new SenderWThreads("Hello",sender); 
		SenderWThreads sender2=new SenderWThreads("Welcome",sender); 
		
		// Start two threads of SenderWThreads type
		sender1.start(); 
		sender2.start(); 
		
		// wait for threads to and 
		try {
			sender1.join();
			sender2.join();
		}
		catch(Exception e) {
			System.out.println("Interrupted..."); 
		}		
	}
}
