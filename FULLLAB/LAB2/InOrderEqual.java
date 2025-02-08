// 6. Given three ints, a b c, return true if they are in strict increasing order, such as 2
// 5 11, or 5 6 7, but not 6 5 7. However, with the exception that if equalOk is
// true, equality is allowed, such as 5 5 7 or 5 5 5.
// E.g.
// inOrderEqual(2, 5, 11, false) → true
// inOrderEqual(5, 7, 6, false) → false
// inOrderEqual(5, 5, 7, true) → true
import java.util.*;
public class InOrderEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.print("Enter c:");
        int c=sc.nextInt();
        System.out.print("Enter true or false(Is equal Ok or not):");
        boolean l=sc.nextBoolean();
        boolean r;
        if(c>b && b>a && l==false)
        {
            r=true;
        }
        else if(c>=b && b>=a && l==true)
        {
            r=true;
        }
        else{
            r=false;
        }
        System.out.println("inOrderEqual("+a+","+b+","+c+","+l+")-->"+r);
        sc.close();
    }
}
