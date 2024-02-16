public class Return {
    public static void main(String args[]) {
        boolean t = true;
        System.out.println("Before The return ");
        if (t) {
            return;
        }
        System.out.println("");
        // Compiler bypass the every statement
        // after return
    }

}
