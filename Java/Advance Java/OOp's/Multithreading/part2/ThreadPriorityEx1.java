// Same Priority Thread
import java.lang.*;
public class ThreadPriorityEx1 extends Thread{
    public void run(){
        System.out.println("Inside the run() method ");
    }
    // the main method 
    public static void main(String args[]){
        Thread.currentThread().setPriority(7);
        System.out.println("Priority of the main thread is : "+Thread.currentThread().getPriority()); 
        ThreadPriorityEx1 th1=new ThreadPriorityEx1();
        // th1 thread is the child of the method 
        // therefor the th1 thread also gets

        System.out.println("Priority of the thread th1 : "+th1.getPriority());
    }
}