// Example of Dynamic Binding
class Animal{
    void eat(){
        System.out.println("Animal is Eatig...");
    }
}
class Dog1 extends Animal {
    void eat(){
        System.out.println("Dog is Eating...");
    }
    public static void main(String args[])
    {
        Animal a =new Dog1();
        a.eat();
    }
}

    