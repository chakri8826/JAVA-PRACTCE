package src;
class Base1{
    Base1(){
        System.out.println("Iam a constructor");
    }
    Base1(int x){
        System.out.println("Iam an overloaded constructor with a value of x: "+x);
    }
    int x;
    public int getX(){
        System.out.println("Iam in Base and setting x now ");
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a printer");
    }
}

class derived1 extends Base1{
    derived1(){
        //super(6);
        System.out.println("Iam an derived class constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("Iam an overloaded  constructor of derived with y value: "+y);
    }
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
class childOfDerived extends derived1{
    public childOfDerived(){
        System.out.println("Iam a child of derived constructor");
    }
    childOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("Iam an overloaded  constructor of derived with z value: "+z);
    }
}
public class CH10_02_Constructors_in_Inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1(2);

//        derived1 d = new derived1();
//        derived1 d = new derived1(100,50);

//        childOfDerived cod = new childOfDerived();
        childOfDerived cod = new childOfDerived(1,2,3);
    }
}

