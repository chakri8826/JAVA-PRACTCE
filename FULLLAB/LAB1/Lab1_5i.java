//Write a java program to find the Sum of digits of given number
import java.util.*;
public class Lab1_5i {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number= ");
        int n=sc.nextInt();
        int sum=0,r;
        int n1=n;
        while(n1>0)
        {
            r=n1%10;
            sum=sum+r;
            n1=n1/10;
        }
        System.out.println("Sum of digits of "+n+" is "+sum+"");
        sc.close();
    }
    
}
