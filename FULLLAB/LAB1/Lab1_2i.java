//Write a Java Program to find sum of two numbers.
import java.util.*;
public class Lab1_2i {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a= ");
        int a = sc.nextInt();
        System.out.print("Enter b= ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of "+a+" and "+b+" is "+sum+"");
        sc.close();
    }
}
