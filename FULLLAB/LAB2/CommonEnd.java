// 22. Given 2 arrays of ints, A and B, return true if they have the same first element
// or they have the same last element. Both arrays will be length 1 or more.
// E,g.
// commonEnd({1, 2, 3}, {7, 3}) → true
// commonEnd({1, 2, 3}, {7, 3, 2}) → false
// commonEnd({1, 2, 3}, {1, 3}) → true
import java.util.*;
public class CommonEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of 1st array:");
        int m=sc.nextInt();
        int array1[]=new int[m];
        for(int i=0;i<m;i++)
        {
            System.out.print("Enter element:");
            array1[i]=sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter size of 2nd array:");
        int n=sc.nextInt();
        int array2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element:");
            array2[i]=sc.nextInt();
        }
        System.out.print("commonEnd({");
        for(int i=0;i<m;i++)
        {
            System.out.print("\""+array1[i]+"\"");
            if(i!=m-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("},{");
        for(int i=0;i<n;i++)
        {
            System.out.print("\""+array2[i]+"\"");
            if(i!=n-1)
            {
                System.out.print(",");
            }
        }
        boolean status=false;
        if(array1[0]==array2[0] || array1[(array1.length)-1]==array2[(array2.length)-1])
        {
            status=true;
        }
        System.out.println("})-->"+status);
        sc.close();
    }    
}
