// 24. Given 2 int arrays, a and b, of any length, return a new array with the
// first element of each array. If either array is length 0, ignore that array.
// E.g.
// front11({1, 2, 3}, {7, 9, 8}) → {1, 7}
// front11({1}, {2}) → {1, 2}
// front11({1, 7}, {}) → {1}
// Note: Write your code in Front11.java
import java.util.*;

public class Front11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of 1st array:");
        int m = sc.nextInt();
        int a[] = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter element:");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter size of 2nd array:");
        int n = sc.nextInt();
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element:");
            b[i] = sc.nextInt();
        }
        int array[] = new int[2];
        int size = 2;
        if (m > 0 && n == 0) {
            array[0] = a[0];
            size = 1;
        } else if (m == 0 && n > 0) {
            array[0] = b[0];
            size = 1;
        } else {
            array[0] = a[0];
            array[1] = b[0];
        }

        System.out.print("front11({");
        if (m != 0) {
            for (int i = 0; i < m; i++) {
                System.out.print("\""+a[i] + "\"");
                if(i!=(m-1))
                {
                    System.out.print(",");
                }
            }
        }
        System.out.print("},{");

        if (n != 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("\""+b[i] + "\"");
                if(i!=(n-1))
                {
                    System.out.print(",");
                }
            }
        }
        System.out.print("})-->{");
        for (int i = 0; i < size; i++) {
            System.out.print("\""+array[i] + "\"");
                if(i!=(size-1))
                {
                    System.out.print(",");
                }
        }
        System.out.println("}");
        sc.close();
        
    }
}
