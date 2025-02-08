//9. Write a java program to find the Power of a number
public class Lab1_9 {
    public static void main(String args[])
    {
        int a=4,n=6;
        int pow=1;
        for(int i=1;i<=n;i++)
        {
            pow=pow*a;
        }
        System.out.println(a+" power "+n+" is "+pow);
        
    }
    
}
