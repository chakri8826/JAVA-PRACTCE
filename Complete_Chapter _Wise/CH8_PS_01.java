package src;

class Employe{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class CH8_PS_01 {
    public static void main(String[] args){
        Employe cherry = new Employe();

        //Setting attributes
        cherry.salary = 99999;
//        cherry.name = "Chakradhar";

        System.out.println(cherry.getSalary());

        cherry.setName("Kommu Chakradhar");
        System.out.println(cherry.getName());





    }
}
