//12. Write a java program to Check the given number is Armstrong or not.
import java.util.*;
public class Lab1_12i {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number= ");
        int n=sc.nextInt();
        double strong = 0, count = 0,r;
        int n1 = n, n2 = n;
        while (n1 > 0) {
            n1 = n1 / 10;
            count++;
        }
        while (n2 > 0) {
            r = n2 % 10;
            strong = strong + Math.pow(r, count);
            n2 = n2 / 10;
        }
        if (n == strong) {
            System.out.print("" + n + " is a armstrong number");
        } else {
            System.out.print("" + n + " is not a armstrong number");
        }
        sc.close();
    }
}
