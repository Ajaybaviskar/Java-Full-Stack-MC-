import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class if_else {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number for checking :- ");
        int no = Integer.parseInt(Br.readLine());

        if (no > 10) {
            System.out.println(no + " Is Greater 10");
        } else {
            System.out.println(no + " Is Less then 10");
        }

    }

}
