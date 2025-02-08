// 3. Given an array of strings, return a new array containing the first N strings.
// N will be in the range 1..length.
// E.g.
// wordsFront({"a", "b", "c", "d"}, 1) → {"a"}
// wordsFront({"a", "b", "c", "d"}, 2) → {"a", "b"}
// wordsFront({"a", "b", "c", "d"}, 3) → {"a", "b", "c"}
import java.io.*;
public class WordsFront {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of strings :");
        int n=Integer.parseInt(br.readLine());
        String array[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter String:");
            array[i]=br.readLine();
        }
        System.out.print("Enter number of strings wanted to print:");
        int m=Integer.parseInt(br.readLine());

        System.out.print("\nwordsFront({");
        for(int i=0;i<n;i++)
        {
            System.out.print("\""+array[i]+"\"");
            if(i!=(n-1))
            {
                System.out.print(",");
            }
        }
        System.out.print("},"+m+")-->{");
        for(int i=0;i<m;i++)
        {
            System.out.print("\""+array[i]+"\"");
            if(i!=(m-1))
            {
                System.out.print(",");
            }
        } 
        System.out.println("}");
    }
}
