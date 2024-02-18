// This is the Example of Custome Exception
class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}
class B{
    static void pass(int marks) throws MyException{
        if(marks<30){
            throw new MyException("This is the Exception");
        }

    }
}

public class App{
    public static void main(String args[])
    {
        try{
            B.pass(20);

        }
        catch(MyException e){
            System.out.println(e);
        }

    }
}