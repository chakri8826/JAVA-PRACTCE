//23. Write a java program to print the prime factors of a given number.
import java.util.*;
public class Lab1_23 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number = ");
        int n=sc.nextInt();
        int count;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count=0;
                for(int j=1;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        count++;
                    }
                }
                if(count==2)
                {
                    System.out.print(i+" ");
                }
            }
        }
        sc.close();
    }
    
}
