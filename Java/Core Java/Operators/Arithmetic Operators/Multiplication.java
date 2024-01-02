import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Multiplication {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter First Number :- ");
        int num1 = Integer.parseInt(Br.readLine());
        System.out.print("Enter Second Number :- ");
        int num2 = Integer.parseInt(Br.readLine());
        System.out.print("Multiplication is :- " + (num1 * num2));
    }

}
