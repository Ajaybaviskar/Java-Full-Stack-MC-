// Java Thread Example by implementing runnable interface 
public class Multi1 implements Runnable{
	public void run() {
		System.out.println("Thread is running...");
	}
	public static void main(String args[]) {
		Multi1 m1=new Multi1();
		Thread t1=new Thread(m1);
		// using the constructor thread running r)
		t1.start();
	}

}
