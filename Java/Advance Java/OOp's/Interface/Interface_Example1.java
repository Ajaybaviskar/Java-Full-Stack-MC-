interface Human_Info {
    int Eyes = 2;

    public void Display();
}

class A implements Human_Info {
    public void Display() {
        System.out.println("Human Has Brain");
    }
}

public class Interface_Example1 {
    public static void main(String args[]) {
        A obj = new A();
        obj.Display();
        // System.out.println(obj.Eyes);    

    }
}