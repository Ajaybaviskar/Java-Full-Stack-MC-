// Thread Pool Methods Example : int activeCount() 
import java.lang.*;
class ThreadNew extends Thread{
    // constructor of the class 
    ThreadNew(String TName,ThreadGroup tg){
        super(tg,TName);
        start();
    }
    // overrring the run method
    public void run(){
        for(int j=0;j<1000;j++){
            try{
                Thread.sleep(5);
            }
            catch(InterruptedException e){
                System.out.println("The Exception has been encounted "+e);
            }
        }
    }
}
public class ActiveCountEx {
    public static void main(String args[]){
        // creating thread group 
        ThreadGroup tg=new ThreadGroup("The Parent group of thread...");
        ThreadNew th1=new ThreadNew("First", tg);
        System.out.println("Starting the first...");

        ThreadNew th2=new ThreadNew("Second", tg);
        System.out.println("Starting the second...");

        // checking the number of active thread by invoking the activecount() method 
        System.out.println("The Total number of active thread are : "+tg.activeCount());
    }
}