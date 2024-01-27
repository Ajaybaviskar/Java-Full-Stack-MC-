
// Importing required classes
import java.io.*;

// Main class
public class Initializer {
    // Initializer block starts..
    {
        System.out.println("Common part of constructors invoked !!");
    }

    public Initializer() {

        System.out.println("Default Constructor invoked");
    }

    public Initializer(int x) {

        // Print statement
        System.out.println(
                "Parameterized constructor invoked");
    }

    public static void main(String arr[]) {

        // Creating variables of class type
        Initializer obj1, obj2;

        // Now these variables are
        // made to object and interpreted by compiler
        // obj1 = new Initializer();

        // obj2 = new Initializer(0);
        System.out.println("Defauoked");
    }

}
