//7. Write a java program to find the Factorial of a number.
import java.util.*;
public class Lab1_7i {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number= ");
        int n=sc.nextInt();
        double factorial=1;
        for(int i=1;i<=n;i++)
        {
            factorial=factorial*i;
        }
        System.out.println(""+n+" factorial is "+factorial+"");
        sc.close();

    }
    
}
