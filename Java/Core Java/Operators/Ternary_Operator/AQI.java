import java.io.*;

public class AQI {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("AQI : ");
        int a = Integer.parseInt(Br.readLine());

        String s = (a < 200) ? "Green" : "Red";
        System.out.println(s);
    }
}