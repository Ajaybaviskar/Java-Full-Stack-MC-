public class Class_Demo {
    String name = "Ajay Baviskar";

    public static void main(String args[]) {

        // Try block to check for exception
        try {
            Class cls = Class.forName("Class_Demo");
            // Creating object of main class
            // using instance method
            Class_Demo obj = (Class_Demo) cls.newInstance();
            // print and display
            System.out.println(obj.name);

        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}