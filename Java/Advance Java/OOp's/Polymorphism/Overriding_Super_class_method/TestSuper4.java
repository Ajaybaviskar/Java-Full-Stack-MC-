class Animal{
    Animal(){
        System.out.println("Animal is created...");
    }

}
class  Dog extends Animal{
    Dog(){
        System.out.println("Dog is Created...");
    }
}
public class TestSuper4{
    public static void main(String args[])
    {
        Dog obj=new Dog();
        

    }
}

