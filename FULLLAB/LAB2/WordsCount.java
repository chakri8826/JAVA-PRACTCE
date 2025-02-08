// 2. Given an array of strings, return the count of the number of strings with
// the given length.
// E.g.
// wordsCount({"a", "bb", "b", "ccc"}, 1) → 2
// wordsCount({"a", "bb", "b", "ccc"}, 3) → 1
// wordsCount({"a", "bb", "b", "ccc"}, 4) → 0
import java.io.*;
public class WordsCount {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of strings :");
        int n=Integer.parseInt(br.readLine());
        String array[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter String:");
            array[i]=br.readLine();
        }
        int count=0;
        System.out.print("Enter length of strings wanted to print:");
        int m=Integer.parseInt(br.readLine());
        System.out.print("\nwordsCount({");
        for(int i=0;i<n;i++)
        {
            if(array[i].length()==m)
            {
                count++;
            }
            System.out.print("\""+array[i]+"\"");
            if(i!=(n-1))
            {
                System.out.print(",");
            }
        }
        System.out.println("},"+m+")--> "+ count);   
    } 
}
