package deadlock;

public class DeadlockSolved 
{
	public static void main(String args[]) 
	{ 
		DeadlockSolved test=new DeadlockSolved(); 
		final resource1 a=test.new resource1(); 
		final resource2 b=test.new resource2(); 	

		Runnable b1=new Runnable() 
		{
			public void run() 
			{
				synchronized(b)
				{
					try
					{
						// adding delay os that both thread can start trying to lock resource
						Thread.sleep(100);
					}
					catch(InterruptedException e) 
					{
						e.printStackTrace();
					}
					// Thread-1 have resource but need resource 2 also
					synchronized(a) {
						System.out.println("In Block 1");
					}
				}
			}
		}; 
		
		
		// Thread-2 
		Runnable b2=new Runnable() {
			public void run() {
				synchronized(b) {
					// Thread -2 have 
					synchronized(a) {
						System.out.println("In Block 2");
					}
				}
			}			
		};
		
		new Thread(b1).start(); 
		new Thread(b2).start(); 
	}
	
	// resource1 
	private class resource1{
		private int i=10; 
		public int getl() {
			return i; 
		}
		public void setl(int i) {
			this.i=i;
		}		
	}
	
	// resourc 2 
	private class resource2{
		private int i=20; 
		public int getl() {
			return i; 
		}
		public void setl(int i) {
			this.i=i;
		}
	}
}






















	
	
	

	
	
	
	
	
	


