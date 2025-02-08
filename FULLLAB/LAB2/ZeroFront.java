// 27. Return an array that contains the exact same numbers as the given array, but
// rearranged so that all the zeros are grouped at the start of the array. The order of
// the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may
// modify and return the given array or make a new array.
// E.g.
// zeroFront({1, 0, 0, 1}) → {0, 0, 1, 1}
// zeroFront({0, 1, 1, 0, 1}) → {0, 0, 1, 1, 1}
// zeroFront({1, 0}) → {0, 1}
// Note: Write your code in ZeroFront.java
import java.util.*;
public class ZeroFront {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element:");
            array[i]=sc.nextInt();
        }
        int arrayNew[]=new int[n];
        int first=0,last=n-1;
        System.out.print("zeroFront({");
        for(int i=0;i<n;i++)
        {
            if(array[i]==0)
            {
                arrayNew[first]=array[i];
                first++;
            }
            else
            {
                arrayNew[last]=array[i];
                last--;
            }
            System.out.print("\""+array[i]+"\"");
            if(i!=(n-1))
            {
                System.out.print(",");
            }
        }
        System.out.print("})-->{");
        for(int i=0;i<n;i++)
        {
            System.out.print("\""+arrayNew[i]+"\"");
            if(i!=(n-1))
            {
                System.out.print(",");
            }
        } 
        System.out.println("}");
        sc.close();
    }
}
