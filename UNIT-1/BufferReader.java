package src;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferReader {
    public static void main(String a[] ) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        System.out.println("Enter a number: ");
        int num=Integer.parseInt(bf.readLine());
        System.out.println(num);

        System.out.println("Enter a String: ");
        String s = bf.readLine();
        System.out.println(s);

        System.out.println("Enter a Double Number: ");
        double d = Double.parseDouble(bf.readLine());
        System.out.println(d);

        bf.close();
    }
}
