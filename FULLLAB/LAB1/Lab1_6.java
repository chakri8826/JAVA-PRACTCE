//Write a java program to print the reverse of a given number.
public class Lab1_6 {
    public static void main(String args[])
    {
        int n=385,rev=0;
        int n1=n,r;
        while(n1>0)
        {
            r=n1%10;
            rev=rev*10+r;
            n1=n1/10;
        }
        System.out.println("Reverse of the number "+n+" is "+rev);
    }
    
}
