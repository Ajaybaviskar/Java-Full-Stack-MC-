public class TestDaemonThread2 extends Thread {
    public void run(){
        System.out.println("Name : "+Thread.currentThread().getName());
        System.out.println("Daemon : "+Thread.currentThread().isDaemon());
    }
    public static void main(String args[]){
        TestDaemonThread2 th1=new TestDaemonThread2();
        TestDaemonThread2 th2=new TestDaemonThread2();
        th1.start();
        th1.setDaemon(true); // will throws Exception
        th2.start();

    }
}