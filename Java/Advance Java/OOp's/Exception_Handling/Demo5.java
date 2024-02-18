// This Example with Try with Resource 

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo5{
    public static void main(String args[])
    {
        try(FileReader f1=new FileReader("abc.txt");
        BufferedReader bf=new BufferedReader(f1)){
            String line;
            while((line=bf.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}