class Operation{
    int square(int n){
        return n*n;
    }
}
public class Circle{
    Operation op; // Aggration 
    double pi=3.14;
    double area (int radius){
        op=new Operation();
        int rsquare=op.square(radius);
        return pi*rsquare;
    }    
    public static void main(String args[])
    {
        Circle obj =new Circle();
        double result =obj.area(5);
        System.out.println(result);
    }
}