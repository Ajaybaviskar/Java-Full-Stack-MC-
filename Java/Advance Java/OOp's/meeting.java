import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class meeting {
    // meeting(int a, int b) // this is the parameters
    // {
    // // System.out.println("Student marks" + marks);
    // System.out.println("Addition is : " + (a - b));
    // }

    meeting(int a, int b, int op) {
        if (op == 1) {
            System.out.println("Addition is :- " + (a + b));
        } else if (op == 2) {
            System.out.println("Subtraction is :- " + (a - b));

        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First Number :- ");
        int no1 = Integer.parseInt(Br.readLine());
        System.out.println("Enter Second Number :- ");
        int no2 = Integer.parseInt(Br.readLine());

        System.out.println("Enter 1 For Addition 2 for Subtrction :- ");
        int op = Integer.parseInt(Br.readLine());
        // meeting ob = new meeting(no1, no2);
        meeting obj = new meeting(no1, no2, op); // argument
    }
}
