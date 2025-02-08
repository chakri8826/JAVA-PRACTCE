public class Demo {
    public static void main(String[] args) {
        circle c=new circle(20, "red", false);
        System.out.println(c);
        System.out.println("Area"+c.getArea());
        Rectangle r=new Rectangle(20, 30, "white", true);
        System.out.println(r);
        System.out.println("Perimeter"+r.getPerimeter());
        square s=new square(5, "Black", false);
        System.out.println(s);
        System.out.println("Length"+s.getLength());
    }
}
