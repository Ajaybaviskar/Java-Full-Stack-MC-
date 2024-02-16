// Multiple Inheritance Not Support Through Classes
class A{
    void msg(){
        System.out.println("Hello");
    }
}
class B{
    void msg(){
        System.out.println("Welcome");
    }
}
public class TestInheritance4 extends A,B{
    public static void main(String args[])
    {
        TestInheritance4 obj=new TestInheritance4();
        obj.msg(); // Error We See Here 


    }
}