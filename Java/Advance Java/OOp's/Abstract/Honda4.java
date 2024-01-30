abstract class Bike
{
    abstract void run(); // Here we declare run Method 
}
public class Honda4 extends Bike {
    void run(){
        // Now Here We Initilize The Method 
        System.out.println("Running Safely");
    }
    public static void main(String args[])
    {
        Bike obj=new Honda4();
        obj.run();

    }
}