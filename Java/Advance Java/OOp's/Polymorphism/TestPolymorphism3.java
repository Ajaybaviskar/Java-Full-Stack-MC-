class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Eating Break...");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Eating Rat...");
    }
}
class Lion extends Animal{
    void eat(){
        System.out.println("Eating Meal...");
    }
}
public class TestPolymorphism3{
    public static void main(String args[])
    {
        Animal a;
        a=new Dog();
        a.eat(); 

        a=new Cat();
        a.eat();

        a=new Lion();
        a.eat();

    }
}