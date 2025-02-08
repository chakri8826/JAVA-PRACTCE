//Sort integer of arrays
import java.io.*;
public class LAB4_10{
    public static void main(String[] args) throws IOException{
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size of array:");
        int size=Integer.parseInt(sc.readLine());
        String array[]=new String[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter String:");
            array[i]=sc.readLine();
        }
        System.out.println("\nOriginal array: ");
        for(int i=0;i<size;i++)
        {
            System.out.println(array[i]+" ");
        }
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(array[i].compareTo(array[j])>0)
                {
                    String temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("\nArray after Sorting: ");
        for(int i=0;i<size;i++)
        {
            System.out.println(array[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}

