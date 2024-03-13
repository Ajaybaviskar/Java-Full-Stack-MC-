// Thread Priority 
// Setter and Getter Method of Thread Priority
// public final int getPriority();
// 3 constants defined in Thread class
// 1) public static int MIN_PRIORITY(1);
// 1) public static int NORM_PRIORITY(5);
// 1) public static int MAX_PRIORITY(10);

import java.lang.*;
public class ThreadPriorityEx extends Thread {

    public void run(){
        System.out.println("Inside the run() Method...");
    }
    // the main method 
    public static void main(String args[]){
        ThreadPriorityEx th1 =new ThreadPriorityEx();
        ThreadPriorityEx th2=new ThreadPriorityEx();
        ThreadPriorityEx th3=new ThreadPriorityEx();

        System.out.println("Priority of the method th1 is : "+th1.getPriority());
        System.out.println("Priority of the method th2 is : "+th2.getPriority());
        System.out.println("Prioriry of the method th3 is : "+th3.getPriority());

        th1.setPriority(6);
        th2.setPriority(3);
        th3.setPriority(9);

        System.out.println("Priority of the Thread th1 is : "+th1.getPriority());
        System.out.println("Priority of the Thread th2 is : "+th2.getPriority());
        System.out.println("Priority of the Thread th3 is : "+th3.getPriority());


        System.out.println("Currently executing the Thread : "+Thread.currentThread().getName());
        System.out.println("Priority of the main Thread is : "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Priority of the main thread is : "+Thread.currentThread().getPriority());
    }
}