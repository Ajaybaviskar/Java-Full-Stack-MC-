abstract class Bike{
    Bike(){
        // Here We Constructor in Abstract Class
        System.out.println("Bike is Created");
    }
    // Now We Create Abstruct Method
    abstract void run();

    void changeGear(){
        // This is the normal Method 
        System.out.println("Gear Change");
    }
}
class Honda extends Bike{
    void run(){
        System.out.println("Running Sefely");
    }
}
public class TestAb2{
    public static void main(String arg[])
    {
        Bike obj=new Honda();
        obj.run();
        obj.changeGear();

    }
}