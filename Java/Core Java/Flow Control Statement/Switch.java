import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Switch {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number : ");
        float no = Float.parseFloat(Br.readLine());
        System.out.println(no);
        System.out.print("Enter Charatar : ");
        char c = (char) Br.read();
        System.out.println(c);
        System.out.print("Enter String : ");
        String str = Br.readLine();
        System.out.println(str);

        // switch (no) {
        // case 1:
        // System.out.println("One");
        // break;
        // case 2:
        // System.out.println("Two");
        // break;
        // default:
        // System.out.println("I think you not follow the range.");
        // System.out.println("Please Enter between 1 to 10");
        // break;
        // }
    }
}
