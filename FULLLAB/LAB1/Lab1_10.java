//10. Write a java program to Check the given number is Perfect or not
public class Lab1_10 {
    public static void main(String args[])
    {
        int n=28,sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.println(n+" is a perfect number");
        }
        else
        {
            System.out.println(n+" is not a perfect number");
        }

    }
    
}
