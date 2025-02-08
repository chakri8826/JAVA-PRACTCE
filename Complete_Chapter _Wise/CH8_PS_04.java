package src;
class rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class CH8_PS_04 {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        rect.length = 2;
        rect.breadth = 4;
        System.out.println(rect.area());
        System.out.println(rect.perimeter());

    }

}
