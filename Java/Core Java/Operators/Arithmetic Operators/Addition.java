import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition {
    // int num1, num2, res;

    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter First Number :- ");
        int num1 = Integer.parseInt(Br.readLine());
        System.out.print("Enter Second Number :- ");
        int num2 = Integer.parseInt(Br.readLine());

        System.out.println("Addition is :- " + (num1 + num2));
    }
}