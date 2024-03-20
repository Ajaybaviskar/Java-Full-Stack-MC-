// Static synchronization 
class Tables{
	synchronized static void printTable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e); 
			}
		}
	}
}
class MyThreads1 extends Thread{
	public void run() {
		Tables.printTable(1);
	}
}

class MyThreads2 extends Thread{
	public void run() {
		Tables.printTable(10);
	}
}
class MyThreads3 extends Thread{
	public void run() {
		Tables.printTable(100);
	}
}
class MyThreads4 extends Thread{
	public void run() {
		Tables.printTable(10000);
	}
}
public class TestSynchronization4 {
	public static void main(String args[]) { 
		MyThreads1 t1=new MyThreads1(); 
		MyThreads2 t2=new MyThreads2(); 
		MyThreads3 t3=new MyThreads3(); 
		MyThreads4 t4=new MyThreads4();
		
		t1.start(); 
		t2.start(); 
		t3.start(); 
		t4.start();	
		
	}
}
