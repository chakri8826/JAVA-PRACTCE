// 7. Given three ints, a b c, one of
// them is small, one is medium and one is large. Return true if the three values are
// evenly spaced, so the difference between small and medium is the same as the
// difference between medium and large.
// E.g.
// evenlySpaced(2, 4, 6) → true
// evenlySpaced(4, 6, 2) → true
// evenlySpaced(4, 6, 3) → false
import java.util.*;
public class EvenlySpaced {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.print("Enter c:");
        int c=sc.nextInt();
        boolean l;
        int max,min,other;
        max=(a>b && a>c)?a:(b>c)?b:c;
        min=(a<b && a<c)?a:(b<c)?b:c;
        other=(a!=max && a!=min)?a:(b!=max && b!=min)?b:c;
        if((max-other==other-min))
        {
            l=true;
        }
        else
        {
            l=false;
        }
        System.out.println("evenlySpaced("+a+","+b+","+c+")-->"+l);
        sc.close();
    }
    
}