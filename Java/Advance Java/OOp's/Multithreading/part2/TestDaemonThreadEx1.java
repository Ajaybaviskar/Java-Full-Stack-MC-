public class TestDaemonThreadEx1 extends Thread{
    public void run(){
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread work...");            
        }
        else{
            System.out.println("User Thread Work...");
        }
    }
    public static void main(String args[]){
        TestDaemonThreadEx1 th1=new TestDaemonThreadEx1();
        TestDaemonThreadEx1 th2=new TestDaemonThreadEx1();
        TestDaemonThreadEx1 th3=new TestDaemonThreadEx1();

        th1.setDaemon(true); // now th1 is daemon thread
        th1.start();
        th2.start();
        th3.start();
    }
}