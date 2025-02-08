package src;

abstract class Parent{
    Parent(){
        System.out.println("Iam the constructor of Parent");
    }
    public void hello(){
        System.out.println("HELLO iam the method of abstract class");
    }
    abstract  public void greet();
    abstract public void greet2();
}
class child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning!....");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon!....");
    }
    void hi(){
        System.out.println("hiii");
    }

}

abstract class child2 extends Parent{
    public void HW(){
        System.out.println("Done HW");
    }
}
public class CH11_01_Abstract_Class {
    public static void main(String[] args){
//        Parent p = new Parent();   // throws error
//        child2 c2 = new child2(); // throws error
        child c = new child();
        c.hi();
        c.greet();

    }
}
