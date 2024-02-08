class Base{
    Base()
    {
        System.out.println("Base class Constructor...");
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("Derived Class Constructor...");
    }
}
public class Test{
    public static void main(String args[])
    {
        Derived obj=new Derived();

    }
}