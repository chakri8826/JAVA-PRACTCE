package src;

public class CH7_01_METHODS {
    static int logic(int x,int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else{
            z=(x+y) * 5;
        }
        x=566;
        return z;
    }
    public static void main(String[] args){
        int a = 5;
        int b = 4;
        int c;
        // Method invocation using Object Creation
//        CH7_METHODS obj = new CH7_METHODS();
//        c=obj.logic(a,b);
        c=logic(a,b);
        System.out.println(a + " " +b );

        int a1 = 1;
        int b1 = 3;
        int c1;
//        c1=obj.logic(a1,b1);
        c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);

    }
}
