// 14. Given a String name, e.g. "Bob", return a greeting of the form "Hello Bob!"
// E.g.
// helloName("Bob") → "Hello Bob!"
// helloName("Alice") → "Hello Alice!"
// helloName("X") → "Hello X!"
import java.io.*;
public class HelloName {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Name:");
        String S=br.readLine();
        System.out.print("helloName(\""+S+"\")-->\"");
        S="Hello "+S+"!";
        System.out.println(S+"\"");
        
    }
}
