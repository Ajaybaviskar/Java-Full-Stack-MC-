package deadlock;
// Reentrant monitor i Java 
// Let's understand the java reentrant monitor by the example given 
class Reentrant {  
    public synchronized void m() {  
    n();  
    System.out.println("this is m() method");  
    }  
    public synchronized void n() {  
    System.out.println("this is n() method");  
    }  
}  
public class ReentrantExample extends Reentrant{
	public static void main(String args[]) {
		
		final ReentrantExample re=new ReentrantExample();  
		  
		Thread t1=new Thread(){  
		public void run(){  
		re.m();//calling method of Reentrant class  
		}  
		};  
		t1.start();  
		
	}
}
