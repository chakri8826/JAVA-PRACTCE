// 19. Return a version of the given string, where for every star (*) in the string the
// star and the chars immediately to its left and right are gone. So "ab*cd" yields
// "ad" and "ab**cd" also yields "ad".
// E.g.
// starOut("ab*cd") → "ad"
// starOut("ab**cd") → "ad"
// starOut("sm*eilly") → "silly"
import java.io.*;
public class StarOut {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        String S=br.readLine();
        String s="";
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)!='*' && (i==0 && S.charAt(i+1)!='*'))
            {
                s=s+S.charAt(i);
            }
            else if(S.charAt(i)!='*' && (i==(S.length()-1)&& S.charAt(i-1)!='*'))
            {
                s=s+S.charAt(i);
            }
            else if(i==S.length()-1 && S.charAt(i-1)=='*')
            {
                break;
            }
            else if(S.charAt(i)!='*' && (S.charAt(i+1)!='*' && S.charAt(i-1)!='*'))
            {
                s=s+S.charAt(i);
            }
            
        }
        System.out.println("starOut(\""+S+"\")-->\""+s+"\"");
    }
    
}
