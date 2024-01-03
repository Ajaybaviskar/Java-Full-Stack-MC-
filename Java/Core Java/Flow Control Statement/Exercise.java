import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise {

    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter First Number :- ");
        int no1 = Integer.parseInt(Br.readLine());

        System.out.print("Enter Second Number :- ");
        int no2 = Integer.parseInt(Br.readLine());

        System.out.print("Enter Third Number :- ");
        int no3 = Integer.parseInt(Br.readLine());

        // no1 no2 no3
        if (no1 > no2) {
            if (no1 > no3) {
                System.out.print("Number One is Greater : " + no1);

            } else {
                System.out.println("Number Three is Greater : " + no3);
            }
        } else {
            if (no2 > no3) {
                System.out.print("Number Two is Greater :- " + no2);
            } else {
                System.out.print("Number Three is Greater :- " + no3);
            }
        }
    }
}