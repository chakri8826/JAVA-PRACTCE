//Write a java program to find the Sum of digits of given number
public class Lab1_5 {
    public static void main(String args[])
    {
        int n=935,sum=0,r;
        int n1=n;
        while(n1>0)
        {
            r=n1%10;
            sum=sum+r;
            n1=n1/10;
        }
        System.out.println("Sum of digits of "+n+" is "+sum);
    }
    
}
