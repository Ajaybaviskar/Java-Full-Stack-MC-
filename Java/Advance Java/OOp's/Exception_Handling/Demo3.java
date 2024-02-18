public class Demo3{
    public static void main(String args[])
    {
        int arr[]={1,2};
        // try{
        //     System.out.println(4/0);
        //     System.out.println(arr[3]);
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println(e);
        // }
        // catch(NullPointerException e)
        // {
        //     System.out.println(e);
        // }
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println(e);
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // } 

        //  another Way for Writing try-catch 

        try{
            System.out.println(arr[3]);
        }
        catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e ){
            System.out.println(e);
        }

    }
}