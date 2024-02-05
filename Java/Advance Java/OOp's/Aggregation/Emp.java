public class Emp{
    int id;
    String name;
    Address address;  // here we have city,state and country

    public Emp(int id, String name, Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println(this.id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);

    }
    public static void main(String arga[]){
        Address address1=new Address("Jalgaon", "Maharashtra", "India");
        Emp e=new Emp(101, "Ajay Baviskar", address1);
        e.display();
    }
}