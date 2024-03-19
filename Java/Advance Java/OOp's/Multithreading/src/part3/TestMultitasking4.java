package part3;
// example with as above by anonymous class 
public class TestMultitasking4 {
	public static void main(String args[]) {
		Thread t1=new Thread() {
			public void run() {
				System.out.println("task one");
			}
		};
		
		// Thread 2 
		Thread t2=new Thread() {
			public void run() {
				System.out.println("task two");
			}
		};
		t1.start();
		t2.start();
	}

}
