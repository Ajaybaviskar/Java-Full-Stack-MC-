import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Subtraction {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First Number :- ");
        int num1 = Integer.parseInt(Br.readLine());
        System.out.println("Enter Second Number :- ");
        int num2 = Integer.parseInt(Br.readLine());

        System.out.println("Subtraction is :- " + (num1 - num2));
    }

}
