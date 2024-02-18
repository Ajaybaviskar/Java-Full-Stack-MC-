import java.io.FileReader;
import java.io.BufferedReader;

public class Demo4{
    public static void main(String args[])
    {
        int arr[]={1,2};
        try{
            FileReader f1=new FileReader("abc.txt");
            BufferedReader br=new BufferedReader(f1);
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            System.out.print(arr[3]);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}