class A {
    private int data = 40;

    private void msg() {
        System.out.println("Hello java");
    }

    void msg2() {
        System.out.println("Message 2 method");
    }
}

public class Private_Acccess_modifier extends A {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.data);// Compile Time Error
        obj.msg();// Compile Time Error
        obj.msg2();
    }

}
