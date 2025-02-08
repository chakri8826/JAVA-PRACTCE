// 16. Given a string, if one or both of the first 2 chars is 'x', return the string
// without those 'x' chars, and otherwise return the string unchanged.
// E.g.
// withoutX2("xHi") → "Hi"
// withoutX2("Hxi") → "Hi"
// withoutX2("Hi") → "Hi"
import java.io.*;
public class WithoutX2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        String S=br.readLine();
        String s="";
        for(int i=0;i<S.length();i++)
        {
            if(!((i==0 && S.charAt(i)=='x')||(i==1 && S.charAt(i)=='x')))
            {
                s=s+S.charAt(i);
            } 
        }
        System.out.println("withoutX2(\""+S+"\")-->\""+s+"\""); 
    }
}
