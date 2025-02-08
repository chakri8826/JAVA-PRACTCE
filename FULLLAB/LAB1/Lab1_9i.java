//9. Write a java program to find the Power of a number
import java.util.*;
public class Lab1_9i {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base= ");
        int a=sc.nextInt();
        System.out.print("Enter power= ");
        int n=sc.nextInt();
        int pow=1;
        for(int i=1;i<=n;i++)
        {
            pow=pow*a;
        }
        System.out.println(""+a+" power "+n+" is "+pow+"");
        sc.close();
    }
}
