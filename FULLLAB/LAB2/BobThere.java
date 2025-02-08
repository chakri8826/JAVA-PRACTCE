// 17. Return true if the given string contains a "bob" string, but where the middle
// 'o' char can be any char.
// E.g.
// bobThere("abcbob") → true
// bobThere("b9b") → true
// bobThere("bac") → false
// Note: Write your code in BobThere.java
import java.io.*;
public class BobThere {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Name:");
        String S=br.readLine();
        boolean status=false;
        for(int i=0;i<(S.length()-2);i++)
        {
            if(S.charAt(i)=='b' && S.charAt(i+2)=='b')
            {
                status=true;
            }
        }
        System.out.println("bobThere(\""+S+"\")-->"+status);

    }
}
