class Employee{
    float salary=50000;
}
public class Programmer extends Employee{
    int bounus=1000;

    public static void main(String args[])
    {
        Programmer p =new Programmer();
        System.out.println("Programmer Salary is : "+p.salary);
        System.out.println("Bouns of Programmer : "+p.bounus);
        
    }
}