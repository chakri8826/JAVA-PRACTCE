//15. Write a java program to print the prime numbers up to the given range n
import java.util.*;
public class Lab1_15 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n= ");
        int count;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count ==2)
            {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    
}
