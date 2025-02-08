// 21. Given two strings, base and remove, return a version of the base string where
// all instances of the remove string have been removed (not case sensitive). You may
// assume that the remove string is length 1 or more. Remove only non-overlapping
// instances, so with "xxx" removing "xx" leaves "x".
// E.g.
// withoutString("Hello there", "llo") → "He there"
// withoutString("Hello there", "e") → "Hllo thr"
// withoutString("Hello there", "x") → "Hello there"
import java.io.*;
public class WithoutString {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string:");
        String S=br.readLine();
        System.out.print("Enter sub string:");
        String s=br.readLine();    
        String newS="";
        for(int i=0;i<S.length();i++)
        {
            int count=0;
            int index=i;
            for(int j=0;j<s.length();j++,index++)
            {
                if(index>S.length()-1)
                break;
                if(S.charAt(index)==s.charAt(j))
                {
                    count++;
                }
            }
            if(count==s.length())
            {
                i=index-1;
            }
            else
            {
                newS=newS+S.charAt(i);
            }
        }
        System.out.println("withoutString(\""+S+"\",\""+s+"\")-->"+"\""+newS+"\"");
    }
    
}
