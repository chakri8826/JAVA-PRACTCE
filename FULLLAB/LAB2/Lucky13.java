// 25. Given an array of ints, return true if the array contains no 1's and no 3's.
// E.g.
// lucky13({0, 2, 4}) → true
// lucky13({1, 2, 3}) → false
// lucky13({1, 2, 4}) → false
// Note: Write your code in Lucky13.java
import java.util.*;
public class Lucky13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int array[]=new int[n];
        boolean status=true;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element:");
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(array[i]==1 || array[i]==3)
            {
                status=false;
                break;
            }
        }
        System.out.print("lucky13({");
        for(int i=0;i<n;i++)
        {
            System.out.print("\""+array[i]+"\"");
            if(i!=(n-1))
            {
                System.out.print(",");
            }
        }
        System.out.println("})-->"+status);
        sc.close();
        System.out.println(array[n]);
    }
}
