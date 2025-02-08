// 4. Start with two arrays of strings, A and B, each with its elements in alphabetical
// order and without duplicates. Return a new array containing the first N elements
// order and without duplicates. Return a new array containing the first N elements
// from the two arrays. The result array should be in alphabetical order and
// without duplicates. A and B will both have a length which is N or more. The best
// "linear" solution makes a single pass over A and B, taking advantage of the fact
// that they are in alphabetical order, copying elements directly to the new array.
// E.g.
// mergeTwo({"a", "c", "z"}, {"b", "f", "z"}, 3) → {"a", "b", "c"}
// mergeTwo({"a", "c", "z"}, {"c", "f", "z"}, 3) → {"a", "c", "f"}
// mergeTwo({"f", "g", "z"}, {"c", "f", "g"}, 3) → {"c", "f", "g"}
import java.io.*;

public class MergeTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of strings of first array :");
        int m = Integer.parseInt(br.readLine());
        String array1[] = new String[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter String:");
            array1[i] = br.readLine();
        }
        System.out.print("Enter number of strings of second array :");
        int n = Integer.parseInt(br.readLine());
        String array2[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter String:");
            array2[i] = br.readLine();
        }
        String merge[] = new String[m + n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            merge[index] = array1[i];
            index++;
        }
        for (int i = 0; i < n; i++) {
            merge[index] = array2[i];
            index++;
        }
        for (int i = 0; i < (merge.length-1); i++) {
            for(int j=i+1;j<merge.length;j++)
            {
                if(merge[i].compareTo(merge[j])>0)
                {
                    String temp=merge[i];
                    merge[i]=merge[j];
                    merge[j]=temp;
                }
            }
        }
        index=0;
        System.out.print("Enter number of strings wanted to print from merge array :");
        int num = Integer.parseInt(br.readLine());
        String mergeDup[]=new String[num];
        int countArray[]=new int[merge.length];
        for (int i = 0; i < merge.length && index<num; i++) {
            for(int j=0;j<merge.length;j++)
            {
                if(merge[i].compareTo(merge[j])==0 && i!=j)
                {
                    countArray[j]=-1;
                }
            }
            if(countArray[i]!=-1)
            {
                mergeDup[index]=merge[i];
                index++;
            }
        }
        

        System.out.print("mergeTwo({");
        for(int i=0;i<m;i++)
        {
            System.out.print("\""+array1[i]+"\"");
            if(i!=(m-1))
            {
                System.out.print(",");
            }
        }
        System.out.print("},{");
        for(int i=0;i<n;i++)
        {
            System.out.print("\""+array2[i]+"\"");
            if(i!=(n-1))
            {
                System.out.print(",");
            }
        }
        System.out.print("},"+num+")-->{");
        for(int i=0;i<num;i++)
        {
            System.out.print("\""+mergeDup[i]+"\"");
            if(i!=(num-1))
            {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
