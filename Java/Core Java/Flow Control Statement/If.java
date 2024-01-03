import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number :- ");
        int no = Integer.parseInt(Br.readLine());
        if (no > 10) {
            System.out.println("Number is Same as 10");
            // block of statements
        }
        System.out.println("I am outer block statement");

    }

}
