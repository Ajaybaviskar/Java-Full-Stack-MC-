// Super is Used to invoke parents class Constructor.
class Animal{
    Animal()
    {
        System.out.println("Animal is Created...");
    }
}
class Dog extends Animal{
    Dog(){
        super(); // here we call Animal instance.
        System.out.println("Dog is Created...");
    }
}
public class TestSuper3{
    public static void main(String args[])
    {
        Dog obj=new Dog();
        

    }
}

// Token for github
// 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 