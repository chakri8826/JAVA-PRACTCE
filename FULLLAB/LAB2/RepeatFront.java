
// 18. Given a string and an int N, return a string made of the first N characters of
// the string, followed by the first N-1 characters of the string, and so on. You may
// assume that N is between 0 and the length of the string, inclusive (i.e. N>=0 and N<= str.length()).
// E.g.
// repeatFront("Chocolate", 4) → "ChocChoChC"
// repeatFront("Chocolate", 3) → "ChoChC"
// repeatFront("Ice Cream", 2) → "IcI"
import java.io.*;

public class RepeatFront {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        String S = br.readLine();
        System.out.print("Enter n:");
        int n = Integer.parseInt(br.readLine());
        if (n > S.length()) {
            System.out.print(n + " is more than given string length");
        }
        else {
            System.out.print("repeatFront(\""+S+"\","+n+")-->\"");
            for (int i = n; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println("\"");
        }
    }
}
