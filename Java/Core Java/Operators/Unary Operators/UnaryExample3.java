public class UnaryExample3 {
    public static void main(String args[]) {
        int a = 10, b = -10;
        boolean c = true, d = false;
        System.out.println(~a); // -11
        // in this operator all positive value will be negative and increase by 1
        System.out.println(~b); // 9
        // in the operator positive of total minus, positive start from 0
        System.out.println(!c); // false (opposite of boolean value)
        System.out.println(!d); // true ()
    }
}