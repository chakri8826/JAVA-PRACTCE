// 1. Given a string, return a version where all the "x" have been removed. Except
// an "x" at the very start or end should not be removed.
// E.g.
// stringX("xxHxix") → "xHix"
// stringX("abxxxcd") → "abcd"
// stringX("xabxxxcdx") → "xabcdx"
import java.io.*;
public class StringX{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        String S=br.readLine();
        String s="";
        for(int i=0;i<S.length();i++)
        {
            if((S.charAt(i)!='x' && S.charAt(i)!='X') || i==0 || (i==S.length()-1))
            {
                s=s+S.charAt(i);
            }
        }
        System.out.println("stringX(\""+S+"\")--> \""+s+"\"");
    }
}