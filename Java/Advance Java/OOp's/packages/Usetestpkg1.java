import testpkg.*;
class Usetestpkg1 implements testpkg.A.StartStop{
    public static void main(String args[])
    {
        testpkg.A obj =new testpkg.A();
        System.out.println(obj.y);
        System.out.println(obj.returny());
        Usetestpkg1 utp=new Usetestpkg1();
        utp.Start();
        utp.Stop();
    }
    public void Start(){
        System.out.println("Start...");
    }
    public void Stop(){
        System.out.println("Stop...");
    }
}
