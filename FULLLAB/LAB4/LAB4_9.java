// Write a java program to find the frequency of occurrences of each number
// from the given array
import java.util.*;
public class LAB4_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter element:");
            array[i]=sc.nextInt();
        }
        System.out.print("Original array: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
        int frequency[]=new int[size];
        for(int i=0;i<size;i++)
        {
            int count=0;
            for(int j=i+1;j<size;j++){
                if(array[i]==array[j] && frequency[j]!=-1)
                {
                    count++;
                    frequency[j]=-1;
                }
            }
            if(frequency[i]!=-1)
                frequency[i]=count+1;
        }
        System.out.println("\nFrequencies of each element in array:");
        for(int i=0;i<size;i++)
        {
            if(frequency[i]!=-1)
            {
                System.out.print(array[i]+ "-->" + frequency[i]+" \n");
            }
        }
        sc.close();
    }
}
