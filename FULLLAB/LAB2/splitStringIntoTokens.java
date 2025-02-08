// 31. Here I have a string value. You have to split that string into tokens. Store each
// token into a String array. You have to print all even index values from that array.
// The String is :”SACHIN TENDULKAR IS MASTER LEGEND”
import java.io.*;
import java.util.StringTokenizer;
public class splitStringIntoTokens {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        String S=br.readLine();
        StringTokenizer split=new StringTokenizer(S);
        int count=0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)==' ')
            count++;
        }
        String array[]=new String[count+1];
        int index=0;
        while(split.hasMoreTokens())
        {
            array[index]=split.nextToken();
            index++;
        }
        System.out.println("Given line of string :"+S);
        System.out.print("Elements at even index values: ");
        for(int i=0;i<count+1;i++)
        {
            if(i%2==0){
            System.out.print(array[i]+" ");
            }
        }




    }
    
}
