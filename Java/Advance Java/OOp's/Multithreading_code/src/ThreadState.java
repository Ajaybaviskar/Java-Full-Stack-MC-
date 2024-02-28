class ABC implements Runnable{
	public void run() {
		// try-catch block
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The state of thread t1 while it invoke the method join() on "
							+ "method t2"+ThreadState.t1.getState());
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e) {
			e.printStackTrace();			
		}
	}
}


// ThreadState class implements the interface Runnable
public class ThreadState implements Runnable {
	public static Thread t1;
	public static ThreadState obj; 
	
	public static void main(String args[]) {
		obj=new ThreadState();
		t1=new Thread(obj);
		// thread t1 is spawhed
		// the thread t1 is currently in the new state
		System.out.println("The State of Thread t1 after spwwing it - "+t1.getState());
		
		// invoking the state () method on the thread t1
		t1.start();
		// thread t1 is moved to the Runnable state 
		System.out.println("The state of thread t1 after invoking the method start() on it "+t1.getState());
		
		
	}
	public void run() {
		ABC myobj=new ABC();
		Thread t2=new Thread(myobj);
		// thread t2 is created and is currently in the new state
		System.out.println("The State of thread t2 after spwwing it -"+t2.getState());
		t2.start();
		// thread t2 is moved to the running
		System.out.println("The state of thread t2 after calling the method"
				+ "start unit- "+t2.getState());
		
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The state of thread t2 after invoking the method sleep() on it - "+t2.getState());
		
		// try-catch block 
		try {
			// waiting for thread t2 to  
			t2.join();			
		}
		catch(InterruptedException e){
			e.printStackTrace();			
		}
		System.out.println("The state of Thread t2 it has completed it's excution - "+t2.getState());
		
	}

}





















