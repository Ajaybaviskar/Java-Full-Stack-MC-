// Try and Catch 
import java.io.FileReader;

public class Demo1{
    public static void main(String args[])
    {
        try{
            FileReader f1=new FileReader("abc.txt");
        }
        catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }
}