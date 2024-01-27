abstract class Car {
    abstract void Fortuner();

    void Innova() {
        System.out.println("Price of Innova is : 30,00,000 Rs");
    }
}

class Manufacturing extends Car {
    public void Fortuner() {
        System.out.println("The Price is : 50,00,000 Rs ");
    }

}

public class Abs {
    public static void main(String args[]) {
        Manufacturing obj = new Manufacturing();

        obj.Fortuner();
        obj.Innova();

    }
}