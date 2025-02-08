package src;
class Circle{
    public int radius;
    Circle(){
        System.out.println("Iam not param of circle");
    }
    Circle(int r){
        System.out.println("Iam circle parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r,int h){
        super(r);
        System.out.println("Iam Cylinder1 parameterized constructor");
        this.height=h;

    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}


class Rectangle1{
    public int length,breadth;
    Rectangle1(){
        System.out.println("Iam not parametrised Constructor");
    }
    Rectangle1(int l,int b){
        System.out.println("Iam parametrised Constructor");
        this.length=l;
        this.breadth=b;
    }

    public double get_area(){
        return this.length*this.breadth;
    }


}
class Cuboid extends Rectangle1{
    public int height;
    Cuboid(int l,int b,int h){
        super(l,b);
        System.out.println("Iam Cuboid1 prametrised Constructor");
        this.height=h;
    }

    public double get_volume(){
        return this.length*this.breadth*this.height;
    }

}

public class CH10_06_PS {
    public static void main(String[] args){
        //Problem 1
//        Circle objC = new Circle(12);
//        Cylinder1 obj = new Cylinder1(12, 4);
//        System.out.println("Area of the circle is "+obj.area());
//        System.out.println( "Volume of the cylinder is "+obj.volume());



        //Problem 2
//        Rectangle1 ObjR = new Rectangle1(2,4);
        Cuboid Objcu = new Cuboid(2,4,6);
        System.out.println("Area of the rectangle is "+Objcu.get_area());
        System.out.println("Volume of the cylinder is "+Objcu.get_volume());


        //Problem 3




    }

}
