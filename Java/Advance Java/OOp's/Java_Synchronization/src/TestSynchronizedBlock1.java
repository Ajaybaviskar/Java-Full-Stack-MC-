// Synchronized Block in Java 
// synchronized (object reference ){
	// code block
//} 
// Example of synchronized Block 
class Tablesb{
	void printTable(int n) {
		synchronized (this) {
			//synchronized block
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
}
class MyThreadsb1 extends Thread{
	Tablesb t; 
	MyThreadsb1(Tablesb t){
		this.t=t; 
	}
	public void run() {
		t.printTable(5);
	}
}
class MyThreadsb2 extends Thread{
	Tablesb t; 
	MyThreadsb2(Tablesb t){
		this.t=t; 
	}
	public void run() {
		t.printTable(100);
	}
}
public class TestSynchronizedBlock1 {
	public static void main(String args[]) {
		Tablesb obj=new Tablesb(); // only one object 
		MyThreadsb1 t1=new MyThreadsb1(obj);
		MyThreadsb2 t2=new MyThreadsb2(obj);  
		t1.start(); 
		t2.start();
		
		
		
	}

}
