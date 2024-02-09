class Bike{
    void run(){
        System.out.println("Running");
    }
    
}
public class Splendar extends Bike{
    void run(){
        System.out.println("Running Safely with 60 KM.. ");
    }
    public static void main(String args[])
    {
        Bike obj=new Splendar();// Here we use upcasting
        obj.run();

        Bike obj1=new Bike();
        obj1.run();

    }

}