import java.util.*;
//18. Write a java program to find the GCD of two numbers.
public class Lab1_18 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int HCF=1;
        System.out.print("Enter m= ");
        int m = sc.nextInt();
        System.out.print("Enter n= ");
        int n = sc.nextInt();
        for(int i=1;i<=m && i<=n;i++)
        {
            if(m%i==0 && n%i==0)
            {
                HCF=i;
            }
        }        
        System.out.printf("HCF of %d and %d is %d",m,n,HCF);
        sc.close();
    }
    
}
