// can we start a thread twice
public class TestThreadTwice1 extends Thread {
	public void run() {
		System.out.println("Running...");
	}
	public static void main(String args[]) {
		TestThreadTwice1 t1=new TestThreadTwice1();
		t1.start();
		t1.start(); // Thread Not start again
	}

}
