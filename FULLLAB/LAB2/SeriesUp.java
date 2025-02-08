// 13. Given n>=0, create an array
// with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n} (spaces added to show the grouping).
// Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to
// exactly n*(n + 1)/2.
// E.g.
// seriesUp(3) → {1, 1, 2, 1, 2, 3}
// seriesUp(4) → {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}
// seriesUp(2) → {1, 1, 2}
import java.util.*;
public class SeriesUp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int array[]=new int[(n*(n+1))/2];
        int index=0;
        System.out.print("seriesUp("+n+")-->{");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                array[index]=j;
                System.out.print(array[index]);
                index++;
                if(index!=((n*(n+1))/2))
                {
                    System.out.print(",");
                }
            }
        }
        System.out.println("}");
        sc.close();
    }
}
