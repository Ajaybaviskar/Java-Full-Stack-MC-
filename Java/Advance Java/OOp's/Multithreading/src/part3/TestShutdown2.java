package part3;
// example with anonyomous class
public class TestShutdown2 {
	public static void main(String args[]) throws Exception {
		Runtime r= Runtime.getRuntime();
		r.addShutdownHook(new Thread() 
		{
			public void run() {
				System.out.println("Shut Down Hook task completed...");
			}
		});
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println(e);
		}		
	}
}
