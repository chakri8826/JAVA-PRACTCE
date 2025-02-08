// 8. Given a string and a non-empty substring sub, compute recursively the largest
// substring which starts and ends with sub and return its length.
// E.g.
// strDist("catcowcat", "cat") → 9
// strDist("catcowcat", "cow") → 3
// strDist("cccatcowcatxx", "cat") → 9
import java.io.*;
public class StrDist {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string:");
        String S=br.readLine();
        System.out.print("Enter sub string:");
        String s=br.readLine();
        int first=-1;
        int last=0;
        for(int i=0;i<S.length();i++)
        {
            int count=0;
            int index=i;
            if(S.charAt(i)==s.charAt(0))
            {
                for(int j=0;j<s.length();j++,index++)
                {
                    if(index>S.length()-1)
                    break;
                    if(S.charAt(index)==s.charAt(j))
                    count++;
                }
                if(count==s.length())
                {
                    if(first==-1)
                    {
                        first=i;
                    }
                    else
                    {
                        last=i+s.length()-1;
                    }
                }
                
            }
        }
        int length=0;
        if(last==0 && first!=-1)
        length=s.length();
        else
        length=last-first+1;
        System.out.println("strDist(\""+S+"\",\""+s+"\") → "+length);
    }
}