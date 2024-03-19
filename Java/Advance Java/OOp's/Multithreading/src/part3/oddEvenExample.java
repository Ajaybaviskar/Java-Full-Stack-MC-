package part3;
// printing even odd number using two threads
public class oddEvenExample {
	// starting the counter 
	int countr=1; 
	static  int NUM; 
	// method for printing the odd numbers 
	public void displayOddNumber() {
		// note that synchorized blocks are necessary for the code for the getting 
		// the desired output if we remove the synchronized block , we will get exception
		synchronized(this) {
			// printing the no till NUM 
			while (countr<NUM) {
				while(countr%2==0) {
					// Exception 
					try {
						wait();
					}
					catch(InterruptedException ex) {
						ex.printStackTrace();
						
					}
				}
				// print no 
				System.out.print(countr +" ");
				// incrementing contr 
				countr=countr+1;
				// notifying the thread which is wating for this look
				notify();
			}
		}
	}
	// method for priting the even no 
	public void displayEvenNumber() {
		synchronized(this) {
			// print the no till NUM 
			while(countr<NUM) {
				while(countr%2==1) {
					try {
						wait();
					}
					catch(InterruptedException ex)
					{
						ex.printStackTrace();
					}
				}
				// print no 
				System.out.print(countr+" ");
				// increment 
				countr=countr+1;
				// nofity to 2 method 
				notify();
			}
		}
	}
	public static void main(String args[]) {
		// The NUM is give 
		NUM=20; 
		final oddEvenExample oe=new oddEvenExample(); 
		
		// creting a thread th1 
		Thread th1=new Thread(new Runnable() {
			public void run() {
				// invoking the method displayEvenNumber() using the thread th1 
				oe.displayEvenNumber();			
			}			
		});
		
		// creating a thread th2 
		Thread th2=new Thread(new Runnable() {
			public void run() {
				// invoking the method displayodd 
				oe.displayOddNumber();
			}
		}); 
		// stating both of the threads  
		th1.start();
		th2.start();
		
		
	}

}
