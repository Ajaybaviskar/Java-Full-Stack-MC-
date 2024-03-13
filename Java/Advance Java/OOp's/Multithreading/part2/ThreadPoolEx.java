import java.util.Date;
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors;
import java.text.SimpleDateFormat; 

class Task implements Runnable{
    private String taskName; 
    // constructor of the class Task 
    public Task(String str){
        taskName=str;
    }
    // printing the task name and then sleep for 1 sec 
    // the complete process is getting repeted 5 times 
    public void run(){
        try {
            for(int j=0;j<=5;j++){
                if(j==0){
                    Date dt=new Date(); 
                    SimpleDateFormat sdt=new SimpleDateFormat("hh : mm : ss");

                    //prints the initialization time for every task  
                    System.out.println("Initialization time for the task name : "+taskName+" = "+sdt.format(dt));

                }
                else{
                    Date dt=new Date();
                    SimpleDateFormat sdf=new SimpleDateFormat("hh : mm : ss");
                    System.out.println("Time of execution for the task name: " + taskName + " = " +sdf.format(dt));  

                }
                Thread.sleep(1000);
            }
            System.out.println(taskName+" Is Complete ");
        } 
        catch (InterruptedException e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
public class ThreadPoolEx {
    // maximum number of thread  in the thread pool
    static final int MAX_TH=3;
    public static void main(String args[]){
        Runnable rb1=new Task("Task 1");
        Runnable rb2=new Task("Task 2");
        Runnable rb3=new Task("Task 3");
        Runnable rb4=new Task("Task 4");
        Runnable rb5=new Task("Task 5"); 

        // creating a thread pool with  MAX_TH number of thread size thread pool size if fix 
        // ExecutorService pl=Excutors.newFixedThreadPool(MAX_TH);
        ExecutorService pl=Executors.newFixedThreadPool(MAX_TH);
        // passes the the task object to pool to excutive(steep 3)

        pl.execute(rb1);
        pl.execute(rb2);
        pl.execute(rb3);
        pl.execute(rb4);
        pl.execute(rb5); 

        // pool is shutdown 
        pl.shutdown();



    }
}