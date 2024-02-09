// java runtime polymorphism with data member
class Bike {
    int speedLimit=90;
}

public class Honda3 extends Bike{
    int speedLimit=150;
    public static void main(String args[])
    {
        Bike obj=new Honda3();
        System.out.println(obj.speedLimit);

        Honda3 obj1=new Honda3();
        System.out.println(obj1.speedLimit);
    }
}