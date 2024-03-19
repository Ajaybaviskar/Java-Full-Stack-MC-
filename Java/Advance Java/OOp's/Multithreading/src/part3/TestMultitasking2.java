package part3;
// Program of perfroming single task by multiple threads
public class TestMultitasking2 implements Runnable{
	public void run() {
		System.out.println("Task One");
	}
	
	public static void main(String args[]) { 
		Thread t1=new Thread(new TestMultitasking2()); 
		Thread t2=new Thread(new TestMultitasking2());
		// passing anonymous object of test multitasking 
		
		t1.start(); 
		t2.start();
		
		
	}
	

}
