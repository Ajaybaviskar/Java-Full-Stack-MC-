interface Drawable{
    void draw();
    static int cube(int x)
    {
        return x*x*x;
    }
}
class Rectangle implements Drawable{
    public void draw()
    {
        System.out.println("Drawing Rectangle");
    }
}
public class TestInterfaceStatic{
    public static void main(String args[])
    {
        Drawable obj=new Rectangle();
        obj.draw();
        System.out.println(Drawable.cube(6));

    
    }

}
