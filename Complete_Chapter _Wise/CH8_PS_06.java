package src;
class circle{
    int radius;
    public float area(){
        return 3.14f*radius*radius;
    }
    public float perimeter(){
        return 2*3.14f*radius;
    }
}
public class CH8_PS_06 {
    public static void main(String[] args) {
        circle cr = new circle();
        cr.radius = 3;
        System.out.println(cr.area());
        System.out.println(cr.perimeter());
    }
}
