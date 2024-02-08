// Super can be used to invoke parent class method
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Eating Bread...");
    }
    void bark(){
        System.out.println("Barking...");
    }
    void Work(){
        super.eat(); // Here We Call Eat method through super keyword 
        bark(); // here we call this class bark 
        eat(); // eat is also we call. eat is Dog class method.
    }
}
public class TestSuper2{
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.Work();
        
    }
}