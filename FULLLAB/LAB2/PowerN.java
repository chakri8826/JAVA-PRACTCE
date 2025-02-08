// 9. Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
// E.g.
// powerN(3, 1) → 3
// powerN(3, 2) → 9
// powerN(3, 3) → 27
import java.util.*;
public class PowerN {
    public static int power(int a,int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return a*power(a,n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base= ");
        int a=sc.nextInt();
        System.out.print("Enter power= ");
        int n=sc.nextInt();
        System.out.println("powerN("+a+","+n+")-->"+power(a,n));
        sc.close();
    }
    
}
