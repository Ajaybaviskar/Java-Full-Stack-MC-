class Animal{
    void eat()
    {
        System.out.println("Eeating...");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("Barking...");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Meowing...");
    }
}
public class TestInheritance3{
    public static void main(String args[])
    {
       Cat c=new Cat(); 
       c.meow();
    //    c.bark();// Error 
       c.eat();
        
    }
}