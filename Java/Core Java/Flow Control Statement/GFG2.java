import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Character : ");
        char c = (char) br.read();
        // Consume the newline character left in the buffer
        br.readLine();
        System.out.println(c);

        System.out.print("Enter String : ");
        String str = br.readLine();
        System.out.println(str);
    }
}
