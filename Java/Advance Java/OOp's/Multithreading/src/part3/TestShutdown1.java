package part3;
// Java Shutdown Hook
class MyThread extends Thread{
	public void run() {
		System.out.println("Shutdown hoot task complete...");
	}
}
public class TestShutdown1 {
	public static void main(String args[]) {
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new MyThread());
		
		System.out.println("Now main sleeping proecess ctrl+c to exit");
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
