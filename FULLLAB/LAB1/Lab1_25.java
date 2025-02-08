//25. Write a java program to print the Ramanujan numbers from the given range.
import java.util.*;
public class Lab1_25 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number of range:");
        int m = sc.nextInt();
        System.out.print("Enter ending number of range:");
        int n = sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            int i1=i,sum=0,sumrev=0,r;
            while(i1>0)
            {
                r=i1%10;
                sum=sum+r;
                i1=i1/10;
            }
            int sum1=sum;
            while(sum1>0)
            {
                r=sum1%10;
                sumrev=sumrev*10+r;
                sum1=sum1/10;
            }
            if((sum*sumrev)==i)
            {
                System.out.println(i);
            }
        }
        sc.close();

    }
    
}
