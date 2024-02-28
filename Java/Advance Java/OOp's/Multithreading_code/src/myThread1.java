// Using the thread class : Thread(String name)
public class myThread1 {
	public static void main(String args[]) {
		// creating an object of the thread class using the constructor Thread(String name)
		Thread t=new Thread("my first thread...");
		t.start();
		String str=t.getName();
		System.out.println(str);
	}

}
