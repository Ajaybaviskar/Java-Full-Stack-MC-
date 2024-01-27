import java.io.*;
import java.io.InputStreamReader;

public class Vote {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter you Age :- ");
        int age = Integer.parseInt(Br.readLine());

        String res = (age >= 18) ? "Eligible" : "Not eligible";
        System.out.println(res);

    }

}