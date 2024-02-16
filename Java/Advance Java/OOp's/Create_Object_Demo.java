import java.io.*;

public class Create_Object_Demo implements Serializable {
    String name;

    Create_Object_Demo(String name) {
        this.name = name;
    }

    public static void main(String args[]) {
        try {
            Create_Object_Demo obj = new Create_Object_Demo("Ajay Baviskar");
            FileOutputStream f = new FileOutputStream("file.text");
            ObjectOutputStream oos = new ObjectOutputStream(f);
            oos.writeObject(obj);
            oos.close();
            f.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
