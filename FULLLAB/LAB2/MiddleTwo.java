// 15. Given a string of even length, return a string made of the middle two chars,
// so the string "string" yields "ri". The string length will be at least 2.
// E.g.
// middleTwo("string") → "ri"
// middleTwo("code") → "od"
// middleTwo("Practice") → "ct”
import java.io.*;
public class MiddleTwo {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String with even length:");
        String S = br.readLine();
        if (S.length() % 2 != 0)
        {
            System.out.print("You Enter a String with odd length");
        } 
        else
        {
            System.out.print("middleTwo(\""+S+"\")-->\"");
            for (int i = S.length() / 2 - 1; i <= S.length() / 2; i++)
            {
                System.out.print(S.charAt(i));
            }
            System.out.println("\"");
        }
    }
}
