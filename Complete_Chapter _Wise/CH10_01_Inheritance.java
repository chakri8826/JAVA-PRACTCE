package src;
class Base{
    int x;
    public int getX(){
        System.out.println("Iam in Base and setting X now ");
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a printer");
    }
}

class derived extends Base{
    int y;
    public int getY(){
        System.out.println("Iam in derived and setting Y now ");
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

}
public class CH10_01_Inheritance {
    public static void main(String[] args){
        //creating an object of Base class
//        Base b = new Base();
//        b.setX(5);
//        System.out.println(b.getX());

        //Creating an object of derived class
        derived d = new derived();
        d.setX(500);
        System.out.println(d.getX());
    }
}
