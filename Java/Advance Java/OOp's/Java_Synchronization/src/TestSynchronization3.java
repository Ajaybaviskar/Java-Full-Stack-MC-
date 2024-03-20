// Example of  Synchronized method by using anonymous class 
// in this program we have created the two threads by using the anonymous class. so less coding is required. 
// program of synchronized method by using anonymous class . 
class Table111{
	synchronized void printTable(int n) {
		// synchronous method 
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(n*i);
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class TestSynchronization3 {
	public static void main(String args[]) {
		Table obj=new Table(); // Only one object
		
		Thread t1=new Thread() {
			public void run() {
				obj.printTable(5);
			}
		};
		Thread t2=new Thread() {
			public void run() {
				obj.printTable(100);
			}
		};
		
		t1.start();
		t2.start();
	}
}
