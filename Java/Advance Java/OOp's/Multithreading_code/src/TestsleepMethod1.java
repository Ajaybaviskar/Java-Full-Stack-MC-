//Example of the sleep() method in Java : on the custom Thread
public class TestsleepMethod1 extends Thread {
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				// thread will sleep 500 millisec
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);				
			}
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		TestsleepMethod1 t1=new TestsleepMethod1();
		TestsleepMethod1 t2=new TestsleepMethod1();
		t1.start();
		t2.start();		
	}

}
