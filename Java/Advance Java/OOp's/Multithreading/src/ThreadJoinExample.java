class ThreadJoin extends Thread{
	public void run() {
		for(int j=0;j<2;j++) {
			try {
				Thread.sleep(300);
				System.out.println("The Current Thread "
						+ "Name is : "+Thread.currentThread().getName());
			}
			catch(Exception e)
			{
				System.out.println("The Exception Has bee caught "+e);
			}
			System.out.println(j);
			
		}
	}
}
public class ThreadJoinExample {
	// main method
	public static void main(String args[]) {
		// creating  3 threads
		ThreadJoin th1=new ThreadJoin();
		ThreadJoin th2=new ThreadJoin();
		ThreadJoin th3=new ThreadJoin();
		
		// thread first call here
		th1.start();
		try {
			System.out.println("The current Thread "
					+ "Name is "+Thread.currentThread().getName());
			// invoking the join
			th1.join();
		}
		catch(Exception e) {
			System.out.println("The Exception has been"
					+ " caught"+e);
		} 
		
		// thread second call here
		// thread th2 starts  
		th2.start();
		try {
			System.out.println("The current Thread "
					+ "Name is "+Thread.currentThread().getName());
			th2.join();
		}
		catch(Exception e) {
			System.out.println("The exception has been caught"+e);
		}
		
		th3.start();		
		
	}

}
