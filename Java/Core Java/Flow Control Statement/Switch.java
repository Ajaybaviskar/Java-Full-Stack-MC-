import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Switch {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Number Between (1 to 10) :- ");
        int no = Integer.parseInt(Br.readLine());

        switch (no) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("I think you not follow the range.");
                System.out.println("Please Enter between 1 to 10");
                break;
        }
    }
}
