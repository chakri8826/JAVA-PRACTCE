//11. Write a java program to Check the given number is palindrome or not.
import java.util.*;
public class Lab1_11i {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number= ");
        int n=sc.nextInt();
        int rev=0;
        int n1=n,r;
        while(n1>0)
        {
            r=n1%10;
            rev=rev*10+r;
            n1=n1/10;
        }
        if(n==rev)
        {
            System.out.println("Given number "+n+" is palendrome ");
        }
        else
        {
            System.out.println("Given number "+n+" is not palendrome ");
        }
        sc.close();
    }
    
}
