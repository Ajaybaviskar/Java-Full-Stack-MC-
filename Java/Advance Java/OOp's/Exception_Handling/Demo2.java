// Example With Try-Catch and finally
public class Demo2{
    public static void main(String args[])
    {
        try{
            System.out.println(4/0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            // this finally block alwasy excute
            System.out.println("I am Finally block contnent...");
        }
    }
}