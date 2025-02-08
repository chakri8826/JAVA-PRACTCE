// 12. Say that a "mirror" section in an array is a group of contiguous elements such
// that somewhere in the array, the same group appears in reverse order. For
// example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2,
// 3} part). Return the size of the largest mirror section found in the given array.
// E.g.
// maxMirror({1, 2, 3, 8, 9, 3, 2, 1}) → 3
// maxMirror({7, 1, 2, 9, 7, 2, 1}) → 2
import java.util.*;
public class MaxMirror {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array:");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element:");
            array[i]=sc.nextInt();
        }
        //int array[] = new int[] { 1, 2, 3, 8, 9, 3, 2, 1 };
        int count = 0, max = 0;
        for (int i = 0; i < array.length-1; i++) {
            count = 0;
            int index = i, last = -1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    last = j - 1;
                    index = index + 1;
                    count++;
                }
                while (last != -1 && array[index] == array[last]) {
                    if (index>=last)
                        break;
                    index++;
                    last--;
                    count++;
                }
            }
            if (max < count) {
                    max = count;
                }
        }
        sc.close();
        System.out.print("maxMirror({");
        for(int i=0;i<array.length;i++)
        {
            System.out.print("\""+array[i]+"\"");
            if(i!=(n-1))
            {
                System.out.print(",");
            }
        }
        System.out.println("})-->"+max);

    }
}
