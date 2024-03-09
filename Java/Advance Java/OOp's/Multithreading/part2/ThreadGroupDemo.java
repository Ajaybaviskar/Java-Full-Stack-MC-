// Thread Group 
// Two constructors Presents in ThreadGroup 
// 1) ThreadGrup(String name) - creates a thread group with given name  
// 2) ThreadGrup(ThreadGrup parent, String name) - creates a thread group with a given parent group and name  

public class ThreadGroupDemo implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[]){
        ThreadGroupDemo runnable=new ThreadGroupDemo();
        ThreadGroup tg1=new ThreadGroup("Parent Thread");
        Thread t1=new Thread(tg1,runnable,"one");
        t1.start();

        Thread t2=new Thread(tg1,runnable,"two");
        t2.start();

        Thread t3=new Thread(tg1,runnable,"three");
        t3.start();

        System.out.println("Thread Group Name : "+tg1.getName());
        tg1.list();
    }
}