public class callby_reference {
    int a = 10, b = 20;

    void show(callby_reference obj) {
        System.out.println(a + b); // 30
        a = 100;
        b = 200;
    }

    public static void main(String args[]) {
        callby_reference obj = new callby_reference();
        obj.show(obj);
        System.out.println(obj.a + obj.b); // 300
    }

}
