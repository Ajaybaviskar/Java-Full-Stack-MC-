class A {
    public void msg() {
        System.out.println("This is the Class A");
    }
}

class B {
    public void msg() {
        A obj = new A() {
            public void msg() {
                System.out.println("This is the class B ");
            }
        };
        obj.msg();
    }
}

public class AnonymousDemo {

    public static void main(String[] args) {
        B objB = new B();
        objB.msg();

    }
}