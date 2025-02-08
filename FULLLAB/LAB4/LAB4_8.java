//Sort integer of arrays
import java.util.*;
public class LAB4_8{
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
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.print("\nArray after Sorting: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
