// 20. We'll say that a "triple" in a string is a char appearing three times in a
// row. Return the number of triples in the given string. The triples may overlap.
// E.g.
// countTriple("abcXXXabc") → 1
// countTriple("xxxabyyyycd") → 3
// countTriple("a") → 0
import java.io.*;
public class CountTriple {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        String S=br.readLine();
        int count=0;
        for(int i=0;i<(S.length()-2);i++)
        {
            if((S.charAt(i)==S.charAt(i+1))&&(S.charAt(i)==S.charAt(i+2)))
            {
                count++;
            }
        }
        System.out.println("countTriple(\""+S+"\")-->"+count);
    }
    
}
