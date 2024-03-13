import java.lang.*;

public class IllegalArgumentEx extends Thread{
    // main method 
    public static void main(String args[]){
        // Now priority of the main thread is set to 17 ,which is greter than 10
        Thread.currentThread().setPriority(17);
        // The current thread is retrev
        // using the currentThread() method 
        // displaying the main thread prority

        System.out.println("Prority of the main thread is "+Thread.currentThread().getPriority());
    }
}