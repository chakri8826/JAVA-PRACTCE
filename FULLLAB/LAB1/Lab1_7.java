//7. Write a java program to find the Factorial of a number.
public class Lab1_7 {
    public static void main(String args[])
    {
        int n=8,factorial=1;
        for(int i=1;i<=n;i++)
        {
            factorial=factorial*i;
        }
        System.out.println(n+" factorial is "+factorial);

    }
    
}
