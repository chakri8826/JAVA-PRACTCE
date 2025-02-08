// 30. Returns true if for every „*‟ (star) in the string, if there are chars
// both immediately before and after the star, they are the same
// Ex:
// sameStar("xy*yzz”)--> true
// sameStar(“xy*zxx”) -->false
// sameStar(“*xa*az”)-->true
// Note: write your code in SameStar.java
import java.io.*;
public class SameStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        String S = br.readLine();
        boolean status=false;
        for(int i=0;i<S.length();i++)
        {
            if((i!=0 && i!=S.length()-1))
            {
                if((S.charAt(i-1)==S.charAt(i+1))&& (S.charAt(i)=='*'))
                {
                    status=true;
                }
            }        
        }
        System.out.println("sameStar(\""+S+"\")-->"+status);
    }
}
