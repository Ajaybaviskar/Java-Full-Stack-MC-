interface Drawable{
    void draw();
    default void msg()
    {
        // Default 
        System.out.println("Default Methods");
    }
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}
public class TestInterfaceDefault{
    public static void main(String args[])
    {
        Drawable obj=new Rectangle();
        obj.draw();
        obj.msg();

    }
}