public class UnaryExample {
    public static void main(String args[]) {
        int n1 = 20;
        int n = 1;
        int sum = 0;
        System.out.println("Number = " + n1);
        n1 = -n1;
        System.out.println("Result : " + n1);
        sum = n1 + --n;
        System.out.println("final result is " + sum);
        System.out.println(sum);
    }
}