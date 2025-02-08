//20. Write an java program that reads two integers, determines whether the first is a multiple of the second and print the result.
import java.util.*;
public class Lab1_20 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m= ");
        int m = sc.nextInt();
        System.out.print("Enter n= ");
        int n = sc.nextInt();
        if(m%n==0)
        {
            System.out.println(m+" is a multiple of "+n);
        }
        else
        {
            System.out.println(m+" is not a multiple of "+n);
        }
        sc.close();

    }
}
