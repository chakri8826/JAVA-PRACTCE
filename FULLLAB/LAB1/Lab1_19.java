//19. Write a java program to find the LCM of two numbers.
import java.util.*;
public class Lab1_19 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int LCM=1;
        System.out.print("Enter m= ");
        int m = sc.nextInt();
        System.out.print("Enter n= ");
        int n = sc.nextInt();
        for(int i=1;;i++)
        {
            if(i%m==0 && i%n==0)
            {
                LCM=i;
                break;
            }
        }
        System.out.println("HCF of "+m+" and "+n+" is "+LCM);
        sc.close();
    }
    
}
