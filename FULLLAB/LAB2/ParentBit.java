// 29. Given a string that contains a single pair of parenthesis, compute recursively
// a new string made of only of the parenthesis and their contents, so “xyz(abc)123”
// yields “(abc)”
// Ex:
// parentBit(“xyz(abc)123”)-->“(abc)”
// parentBit(“x(hello)”) -->“(hello)”
// parentBit(“(xy)1”) -->“(xy)”
import java.io.*;
public class ParentBit {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        String S=br.readLine();
        String s="";
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='(')
            {
                s=s+S.charAt(i);
                i++;
                while(S.charAt(i)!=')')
                {
                    s=s+S.charAt(i);
                    i++;
                    if(i==S.length()-1)
                    {
                        break;
                    }
                }
                s=s+S.charAt(i);
                break;
            }
        }
        System.out.println("parentBit(\""+S+"\")-->\""+s+"\"");
    }
}
