
// 26. Given an array of ints, return true if the value 3 appears in the array exactly
// 3 times, and no 3's are next to each other.
// E.g.
// haveThree({3, 1, 3, 1, 3}) → true
// haveThree({3, 1, 3, 3}) → false
// haveThree({3, 4, 3, 3, 4}) → false
// Note: Write your code in HaveThree.java
import java.util.*;

public class HaveThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element:");
            array[i] = sc.nextInt();
        }
        int count = 0;
        boolean status;
        for (int i = 0; i < n; i++) {
            if (i == 0 && array[i] == 3 && array[i + 1] != 3)
                count++;
            else if (i == array.length - 1 && array[i] == 3 && array[i - 1] != 3)
                count++;
            else if (array[i] == 3 && array[i - 1] != 3 && array[i + 1] != 3)
                count++;
        }
        if (count == 3)
            status = true;
        else
            status = false;

        System.out.print("haveThree({");
        for (int i = 0; i < n; i++) {
            System.out.print("\"" + array[i] + "\"");
            if(i!=(n-1))
            {
                System.out.print(",");
            }
        }
        System.out.println("})-->"+status);
        sc.close();
    }

}
