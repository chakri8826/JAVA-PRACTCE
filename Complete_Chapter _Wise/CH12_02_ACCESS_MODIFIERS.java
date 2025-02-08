package src;
class c1{
    public int x=5;
    protected int y=10;
    int z=15;
    private int a=20;
    public void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class CH12_02_ACCESS_MODIFIERS{
    public static void main(String[] args){
        c1 c = new c1();
//        c.meth();

//        System.out.println(c.a);
    }
}