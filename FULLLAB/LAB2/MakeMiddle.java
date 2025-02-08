// 23. Given an array of ints of even length, return a new array length 2 containing
// the middle two elements from the original array. The original array will be length
// 2 or more.
// E.g.
// makeMiddle({1, 2, 3, 4}) → {2, 3}
// makeMiddle({7, 1, 2, 3, 4, 9}) → {2, 3}
// makeMiddle({1, 2}) → {1, 2}
// Note: Write your code in MakeMiddle.java
import java.util.*;
public class MakeMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array(even number only):");
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element:");
            array[i] = sc.nextInt();
        }
        if (array.length % 2 != 0) {
            System.out.print("Create an array with even size only");
        } else {
            int arrayNew[] = new int[2];
            for (int i = 0; i < 2; i++) {
                arrayNew[0] = array[((array.length) / 2) - 1];
                arrayNew[1] = array[(array.length) / 2];
            }
            System.out.print("makeMiddle({");
            for(int i=0;i<n;i++)
            {
                System.out.print("\""+array[i]+"\"");
                if(i!=(n-1))
                {
                    System.out.print(",");
                }
            }
            System.out.print("})-->{");
            for (int i = 0; i < 2; i++) {
                System.out.print("\""+arrayNew[i]+"\"");
                if(i==0)
                {
                    System.out.print(",");
                }
                else
                {
                    System.out.println("}");
                }
            }
        }
        sc.close();
    }
}
