// Java program to illustrate
// Call by Value

// Callee
class CallByValue {

    public static void example(int x, int y) {
        x++;
        y++;
    }
}

// Caller
public class call_byvalue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        CallByValue object = new CallByValue();
        System.out.println("Value of a: " + a + " & b: " + b);
        object.example(a, b);
        System.out.println("Value of a: " + a + " & b: " + b);
    }
}
