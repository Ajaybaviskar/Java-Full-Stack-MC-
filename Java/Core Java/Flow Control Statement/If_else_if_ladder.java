import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class If_else_if_ladder {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Favorite Number Between(0 to 7) :- ");
        int no = Integer.parseInt(Br.readLine());

        if (no == 0) {
            System.out.println("Your Favorite Day is Sunday");
            System.out.println("Enjoy your Sunday");
        } else if (no == 1) {
            System.out.println("Your Favorite Day is Monday");
            System.out.println("Phase 1 Working Day");
        } else if (no == 2) {
            System.out.println("Your Favorite Day is Thursday");
            System.out.println("Phase 2 Working Day");
        } else if (no == 3) {
            System.out.println("Your Favorite Day is Wednesday");
            System.out.println("Phase 3 Working Day");
        } else if (no == 4) {
            System.out.println("Your Favorite Day is Thursday");
            System.out.println("Less Work Day them Other day");
        } else if (no == 5) {
            System.out.println("Your Favorite Days is Friday");
            System.out.println("Waiting for Sunday");
        } else if (no == 6) {
            System.out.println("Your Favorite Day is Saturday");
            System.out.println("Half Day");

        } else {
            System.out.println("I Thing You Not Follow Range Between 1 to 7 ");
            System.out.println("Please Follow this other wise you Face Error");

        }

    }

}
