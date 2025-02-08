//16. Write a java program to print the Fibonacci series up to the given range n.
import java.util.*;
public class Lab1_16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n= ");
        int n = sc.nextInt();
        sc.close();
        int a = 0, b = 1, c;
        c = a + b;
        if (n >= 0) {
            System.out.print(a+" ");
        }
        if (n >= 1) {
            System.out.print(b+" ");
        }
        if (n >= 2) {
            for (; c <= n; c = a + b) {
                System.out.print(c+" ");
                a = b;
                b = c;
            }
        }
        
    }
}
