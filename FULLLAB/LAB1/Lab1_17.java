//17. Write a java program to Print the Perfect numbers in the given range
import java.util.*;
public class Lab1_17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m= ");
        int m = sc.nextInt();
        System.out.print("Enter n= ");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }

}
