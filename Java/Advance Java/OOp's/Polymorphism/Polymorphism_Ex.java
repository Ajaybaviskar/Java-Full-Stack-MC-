class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void Display1() {
        System.out.println(id);
        System.out.println(name);
    }
}

class Emp extends Person {
    float salary;

    Emp(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    void Display() {
        System.out.println("Person Id is : " + id);
        System.out.println("Person name is : " + name);
        System.out.println("Person salary is : " + salary);
    }
}

public class Polymorphism_Ex {
    public static void main(String[] args) {
        // Emp obj = new Emp(101, "Raviraj Patil ", 100000);
        Person obj1 = new Person(102, "Ajay Baviskar");

        // obj.Display();
        obj1.Display1();

    }
}