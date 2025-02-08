//Write a java program to Check the given year is Leap year or not.
import java.util.*;
public class Lab1_4i {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year = ");
        int year=sc.nextInt();
        if((year%400==0)||((year%4==0)&&(year%100!=0)))
        {
            System.out.println(""+year+" is a Leap year");
        }
        else
        {
            System.out.println(""+year+" is not a Leap year");
        }
        sc.close();
    }
    
}
