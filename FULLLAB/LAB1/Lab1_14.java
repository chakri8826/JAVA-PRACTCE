// 14. Example program on Scanner.
import java.util.*;
public class Lab1_14 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number = ");
        int a=sc.nextInt();
        System.out.print("Enter a floating point number = ");
        float b=sc.nextFloat();
        System.out.print("Enter a string = ");
        String c=sc.next();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        sc.close();
    }
    
}
