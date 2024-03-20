package deadlock;
// Inter-thread communication in java
class Customer{
	int amount=1000; 
	synchronized void withDraw(int amount) {
		System.out.println("Going to WithDraw");
		if(this.amount<amount) {
			System.out.println("less balance wating for deposit...");
			try {
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e); 
			}
		}
		this.amount-=amount; 
		System.out.println("Withdraw Complete...");
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Going to Deposit..."); 
		this.amount+=amount; 
		System.out.println("deposit Complete...");
		notify();
	}
}

public class Test_inter_thread {
	public static void main(String args[]) {
		final Customer c=new Customer(); 
		new Thread() {
			public void run() {
				c.withDraw(15000);
			}
		}.start();
		
		
		
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}
}
