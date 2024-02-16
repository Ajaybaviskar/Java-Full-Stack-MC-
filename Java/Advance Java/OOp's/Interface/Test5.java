// Exmaple of abstract class and Interface in Java
interface A{
    void a(); // by default , public and static 
    void b();
    void c();
    void d();
}
abstract class B implements A{
    public void c(){
        System.out.println("I am C");
    }
}
class M extends B{
    public void a(){
        System.out.println("I am A");
    }
    public void b(){
        System.out.println("I am B");
    }
    public void d(){
        System.out.println("I am d");
    }
}
public class Test5{
    public static void main(String args[])
    {
        A obj=new M();
        obj.a();
        obj.b();
        obj.c();
        obj.d();

    }
}