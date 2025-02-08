// 32. Write a java program to identify the total number of occurrences of the sub
// string. Here the String value is: “The problem is not the problem, the problem is
// your attitude about the problem do you understand!!” Substring is : “the”. You
// have to identify the total number of occurrences of substring and print the count.
import java.io.*;
public class SubStringOccurence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter String:");
        String S = br.readLine();
        System.out.print("Enter substring:");
        String s = br.readLine();
        int count = 0;
        int index;
        int repeat;
        for (int i = 0; i < S.length(); i++) {
            index = i;
            if (S.charAt(i) == s.charAt(0)) {
                repeat=0;
                for (int j = 0; j < s.length(); j++,index++) {
                    if(index>S.length()-1)
                        break;
                    if(S.charAt(index)==s.charAt(j))
                    {
                        repeat++;
                    }
                }
                if(repeat==s.length())
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
