// 11. We'll say that a "pair" in a string is two instances of a char separated by a
// char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs
// -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.
// E.g.
// countPairs("axa") → 1
// countPairs("axax") → 2
// countPairs("axbx") → 1
import java.io.*;
public class CountPairs {
    public static int pairs(int i,String S,int pair)
    {
        if(i==(S.length()-2))
        {
            return pair;
        }
        else
        {
            if(S.charAt(i)==S.charAt(i+2))
                pair++;
            return pairs(i+1,S,pair);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        String S=br.readLine();
        int pair=0;
        pair=pairs(0,S,pair);
        System.out.println("countPairs(\""+S+"\")-->"+pair);
    }
    
}
