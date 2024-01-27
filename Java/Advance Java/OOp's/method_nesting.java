public class method_nesting {

    public void m1() {
        System.out.println("Jay Shree Ram");
    }

    public void m2() {
        System.out.println("Om Namha Shivay");
        m1();
    }

    public void m3() {
        System.out.println("Narayan");
        m2();
    }

    public static void main(String[] args) {
        method_nesting ms = new method_nesting();
        ms.m3();

    }

}
