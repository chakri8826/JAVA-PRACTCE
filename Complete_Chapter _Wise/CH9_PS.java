package src;
class cylinder{
    public cylinder(int radius, int height){
        this.radius = radius ;
        this.height = height ;
    }
  private  int radius;
   private int height;
    public int getradius(){
        return radius;
    }
    public void setradius(int r){
        radius = r;
    }
    public int getheight(){
        return height;
    }
    public void setheight(int h){
        height = h;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius ;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

class Rectangle {
    private int length;
    private int breadth;

    public  Rectangle() {
        this.length = 10;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class CH9_PS {
    public static void main(String[] args){
        //Problem 1
        cylinder cyl = new cylinder(9, 12);
////        cyl.setradius(9);
//        System.out.println(cyl.getradius());
////        cyl.setheight(12);
//        System.out.println(cyl.getheight());
//
//        //Problem 2
//        System.out.println(cyl.surfaceArea());
//        System.out.println(cyl.volume());


        //Problem 4
        Rectangle rec = new Rectangle();
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
//        Rectangle rec = new Rectangle(100,77);




    }
}
