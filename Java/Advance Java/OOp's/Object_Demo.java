public class Object_Demo {
    String Name;
    String Breed;
    String Color;
    int Age;

    public Object_Demo(String Name, String Breed, String Color, int Age) {
        this.Name = Name;
        this.Breed = Breed;
        this.Color = Color;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public String getBreed() {
        return Breed;
    }

    public String getColor() {
        return Color;
    }

    public int getAge() {
        return Age;
    }

    public String print_info() {
        return ("Dog Name is " + this.getName() +
                "Dog Breed is : " + this.getBreed() +
                "Dog Color is :" + this.getColor() +
                "Dog Age is : " + this.getAge());

    }

    public static void main(String args[]) {
        Object_Demo pitbull = new Object_Demo("Shera", "pitbull", "Black", 3);
        System.out.print(pitbull.print_info());

    }

}
