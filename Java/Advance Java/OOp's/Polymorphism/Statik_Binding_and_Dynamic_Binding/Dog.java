// This Example of Static Binding
public class Dog{
    private void eat(){
        System.out.println("Dog is Eating...");
    }
    public static void main(String args[]){
        Dog d1=new Dog();
        // d1 is instance 
        d1.eat(); 
    }
}