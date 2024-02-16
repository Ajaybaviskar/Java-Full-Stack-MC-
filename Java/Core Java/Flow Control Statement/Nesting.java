import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Nesting {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number :- ");
        int no = Integer.parseInt(Br.readLine());
        if (no > 10) {
            if (no > 15) {
                System.out.println(no + "is Greater Them 15 and 10");
            } else {
                System.out.println(no + " is not Greater them 15");
            }
        } else {
            System.out.println(no + " Is less then 10");
        }

    }

}
