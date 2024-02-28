// Using the Thread class : Thread(Runnable r, String name)

public class myThread2  implements Runnable{
	public void run() {
		System.out.println("Now the thread is run...");		
	}
	// main method
	public static void main(String args[]) {
		// creating an object for the class myThread2
		Runnable r1=new myThread2();
		// creating an object of the class Thread Using Thread(Runnable r Stirng name)
		Thread th1=new Thread(r1,"my new Thread");
		// the start method moves
		th1.start();
		String str=th1.getName();
		System.out.println(str);
	}

}
