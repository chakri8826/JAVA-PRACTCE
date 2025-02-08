package src;
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class CH8_PS_03 {
    public static void main(String[] args) {
        square aps = new square();
        aps.side = 2;

        System.out.println(aps.area());
        System.out.println(aps.perimeter());

    }

}
