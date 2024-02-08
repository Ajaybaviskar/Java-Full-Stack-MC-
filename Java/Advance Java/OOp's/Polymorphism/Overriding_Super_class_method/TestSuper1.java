class Animal{
    String color="White";
}
class Dog extends Animal{
    String color="Black";
    void printcolor(){
        System.out.println(color);
        System.out.println(super.color); // here we access the parent class instance using super keyword        
    }
}
public class TestSuper1{
    public static void main(String args[])
    {
        Dog obj=new Dog();
        obj.printcolor();
    }
}