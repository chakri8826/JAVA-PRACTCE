//Write a java program to print the reverse of a given number.
import java.util.*;
public class Lab1_6i {
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
        System.out.println("reverse of the number "+n+" is "+rev+"");
        sc.close();
    }
    
}
