package src;
class Employee{
    int id;
    String name;
    int salary;
    public void print_details(){
        System.out.println("My id is "+id);
        System.out.println("and my name is "+name);
        System.out.println("");
    }
    public int get_salary(){
        return salary;
    }
}

public class CH8_Custom_Class {
    public static void main(String[] args){
        System.out.println("This is our custom class");
        Employee chakri = new Employee(); //Instantiating a new Employee object
        Employee revanth = new Employee();
        // Setting attributes for chakri
        chakri.id = 898;
        chakri.name = "Chakradhar";
        chakri.salary = 200000;

        // Setting attributes for revanth
        revanth.id = 621;
        revanth.name = "revanth";
        revanth.salary = 200000;

//        printing the attributes
//        System.out.println(chakri.id);
//        System.out.println(chakri.name);
          chakri.print_details();
          revanth.print_details();
          int salary = chakri.get_salary();
        System.out.println(salary);
    }
}
