//Write a Java Program to check the given number is prime or not.
public class Lab1_3 {
    public static void main(String args[])
    {
        int n=7,count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(n+" is a prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }
    }
    
}
