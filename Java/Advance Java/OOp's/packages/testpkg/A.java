public class A{
    int x=1;
    public int y=2;
    protected int z=3;

    int returnx(){
        return x;
    }

    public int returny(){
        return y;
    }

    protected int returnz(){
        return z;
    }
    public interface StartStop
    {
        void Start();
        void Stop();
    }
}
class B{
    public static void main(String args[])
    {
        System.out.println("Hello");
    }
}