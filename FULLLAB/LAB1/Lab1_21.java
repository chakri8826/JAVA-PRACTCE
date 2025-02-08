//21. Write a java program to Print the Armstrong numbers up to the given range.
import java.util.*;
public class Lab1_21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number of range= ");
        int m = sc.nextInt();
        System.out.print("Enter last number of range= ");
        int l = sc.nextInt();
        int n1, n2, n;
        double r = 0, count = 0, strong;
        for (int k = m; k <= l; k++) {
            n = n1 = n2 = k;
            count = 0;
            strong = 0;
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
                System.out.print(n+" ");
            }
        }
        sc.close();
    }
}
