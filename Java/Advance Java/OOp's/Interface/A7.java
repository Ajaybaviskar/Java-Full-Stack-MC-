// This is Example is for Multiple Inheritance and we achive through interface 
interface Printable{
    public void print();
}
interface Showable{
    public void show();
}
public class A7 implements Printable,Showable{
    public void print()
    {
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }
    public static void main(String args[])
    {
        A7 obj=new A7();
        obj.print();
        obj.show();

    }
}