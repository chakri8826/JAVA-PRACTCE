public class Customer {
    String name;
    int age;
    String mail;
    boolean present;
    public Customer(String n,int age,String m)
    {
        this.name=n;
        this.age=age;
        this.mail=m;
    }
    public String toString()
    {
        return "Name:"+name+" Age:"+age+" Mail:"+mail;
    }
}