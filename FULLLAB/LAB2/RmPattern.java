// 28. write a java program that look for patterns like “ram” and “rom” in the string
// length should be 3, starting with „r‟ and ending with „m‟. You have to return a
// string where for all such words, the middle letter is gone, and so
// “ramXrom” yields “raXrm”.
// i.
// ramRom(“ramXrom” ) -- “rmXrm”
// ii.
// ramRom(“ramrom”)-- “rmrm”
// iii.
// ramRom(“rrromrom”) -- “rrrmrm”
// Note: write your code in RmPattern.java
import java.io.*;
public class RmPattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        String S = br.readLine();
        String s = "";
        for (int i = 0; i < S.length(); i++) {
            if (i == 0 || i == S.length() - 1)
                s = s + S.charAt(i);
            else if (!(S.charAt(i - 1) == 'r' && S.charAt(i + 1) == 'm'))
                s = s + S.charAt(i);
        }
        System.out.println("ramRom(\""+S+"\")-->\""+s+"\"");
    }
}
