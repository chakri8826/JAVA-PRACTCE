//22. Write a java program to print the Perfect squares in the given range.
import java.util.*;
public class Lab1_22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number of range= ");
        int m = sc.nextInt();
        System.out.print("Enter last number of range= ");
        int n = sc.nextInt();
        int s;
        for(int i=m;i<=n;i++)
        {
            s=i*i;
            System.out.println(i+" square ="+s);
        }
        sc.close();
    }
}
