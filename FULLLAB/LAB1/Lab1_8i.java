//8. Write a java program to Find maximum of three numbers.
import java.util.*;
public class Lab1_8i {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number= ");
        int a=sc.nextInt();
        System.out.print("Enter number= ");
        int b=sc.nextInt();
        System.out.print("Enter number= ");
        int c=sc.nextInt();
        int max=(a>b && a>c)?a:(b>c)?b:c;
        System.out.println("Maximum of the numbers "+a+","+b+","+c+" is "+max+"");
        sc.close();
    }
    
}
