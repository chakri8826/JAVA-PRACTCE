// 31. Write a program to substitute the vowels present in a string
// i.
// For example if I enter: I am happy
// ii.
// ii. First it has to search for the vowels and display that the vowels are
// :I, a,a
// iii.
// Then it has to substitute the vowels by a , e, I, o, u by b, f, j,p,v
// iv.
// The changed string is: j bm hbppy
// Input: I am happy
// Output: The vowels in given string: I,a,a,
// Number of vowels in given string: 3
// Changed string: j bm hbppy
import java.io.*;
public class VowelSub {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        String S=br.readLine();
        String s="";
        String vowels="AEIOUaeiou";
        String replace="BFJPVbfjpv";
        System.out.println("Given String: "+S);
        System.out.print("Vowels in given String:");
        int count=0;
        for(int i=0;i<S.length();i++)
        {
            int vowel=0;
            for(int j=0;j<vowels.length();j++)
            {
                if(S.charAt(i)==vowels.charAt(j))
                {
                    vowel=1;
                    System.out.print(S.charAt(i)+" ");
                    s=s+replace.charAt(j);
                    count++;
                }
            }
            if(vowel==0)
            {
                s=s+S.charAt(i);
            }
        }
        System.out.println("\nTotal number of vowels:"+count);
        System.out.println("Updated String :"+s);
    }
}
