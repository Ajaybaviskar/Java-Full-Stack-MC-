import java.util.Scanner;

public class elder_person {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Ajay Age :-");
        int a = s.nextInt();

        System.out.println("Enter Raviraj Age :-");
        int r = s.nextInt();

        System.out.println("Enter Gaurav Age :-");
        int g = s.nextInt();
        // tack input from user using Scanner class

        // a r g
        if (a > r) {
            if (a > g) {
                System.out.print("Ajay is Elder than Raviraj and Gaurav");
            } else {
                System.out.println("Gaurav is Elder than Ajay and Raviraj");
            }
        } else {
            if (r > g) {
                System.out.println("Raviraj is Elder than Ajay and Gaurav");
            } else {
                System.out.println("Gaurav is Elder tham Ajau and Rviraj ");

            }
        }

    }

}
