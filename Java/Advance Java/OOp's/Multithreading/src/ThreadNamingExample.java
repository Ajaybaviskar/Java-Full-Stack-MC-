// Example of naming a thread without using setName() Method
// a Java program that shows how one can set the name of a thread at the time of creation of the thread
import java.io.*;
// The ThreadNameclass is the child class 
class ThreadName extends Thread{
    // constructor of the class 
    ThreadName(String ThreadName){
        // invoking the constructor of the superclass, which is threadclass 
        super(ThreadName);
    }
    // overriding the method run()
    public void run(){
        System.out.println("The thread is exeucting...");
    }
}
public class ThreadNamingExample{

    public static void main(String args[]){ 
        // creating tow thread and setting their name using the constructor
        ThreadName th1=new ThreadName("Java");
        ThreadName th2=new ThreadName("Python"); 
        
        // Invoking the getName() method to get the names 
        // of the thread created above
        System.out.println("Thread -1 : "+th1.getName());
        System.out.println("Thread -2 : "+th2.getName());
        // invoking the start() method on both the threads
        th1.start();
        th2.start();

    }
}