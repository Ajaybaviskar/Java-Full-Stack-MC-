// Java thread Pool 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

class WorkerThread implements Runnable{
    private String msg;
    public WorkerThread(String s){
        // constructor 
        this.msg=s;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+"(Start) message "+msg); 
        processmsg(); // call processmsg method here method that sleep the thread for 2 sec
        System.out.println(Thread.currentThread().getName()+"(End)");
    }
    private void processmsg(){
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}