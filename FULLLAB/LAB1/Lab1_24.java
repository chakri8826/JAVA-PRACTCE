//24. Write a java program to print the same digit numbers in the given range.
import java.util.*;
public class Lab1_24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number of range:");
        int m = sc.nextInt();
        System.out.print("Enter ending number of range:");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            int i1 = i, logic = 1;
            while (i1 > 0) {
                int a = i1 % 10;
                i1 = i1 / 10;
                int b = i1 % 10;
                if (a != b && b != 0) {
                    logic = 0;
                    break;
                }
            }
            if (logic == 1) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
