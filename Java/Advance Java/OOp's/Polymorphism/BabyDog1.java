class Animal{
    void eat(){
        System.out.println("Animal is Eating :");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog is Eating...");
    }
}
class BabyDog1 extends Dog{
    public static void main(String args[])
    {
        Animal a=new BabyDog1();
        a.eat();
    }
}