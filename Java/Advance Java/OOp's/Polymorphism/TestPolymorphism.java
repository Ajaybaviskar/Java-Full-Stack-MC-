class Bank{
    float getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    float getRateOfInterest(){
        return 9.02f;
    }
}
class ICICI extends Bank{
    float getRateOfInterest(){
        return 7.80f;
    }
}
class PNB extends Bank{
    float getRateOfInterest(){
        return 8.08f;
    }
}
public class TestPolymorphism{
    public static void main(String args[])
    {
        Bank b;
        b=new SBI();
        System.out.println("SBI Interest Rate is : "+b.getRateOfInterest());
        b=new ICICI();
        System.out.println("ICICI Interest Rate is : "+b.getRateOfInterest());
        b=new PNB();
        System.out.println("Panjab National Bank Interest Rate is : "+b.getRateOfInterest());

    }
}