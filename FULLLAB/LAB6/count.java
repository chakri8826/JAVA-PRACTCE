import java.io.*;
import java.util.StringTokenizer;
public class count{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new FileReader("input.txt"));
        String s=br.readLine();
        int words=0,spaces,lines=0,character=0,alphabets=0,digits=0,special=0;
        while(s!=null)
        {
            StringTokenizer st=new StringTokenizer(s);
            while(st.hasMoreTokens())
            {
                words++;
                String w=st.nextToken();
                for(int i=0;i<w.length();i++)
                {
                    character++;
                    if((w.charAt(i)>='A'&& w.charAt(i)<='Z')||(w.charAt(i)>='a'&&w.charAt(i)<='z'))
                    alphabets++;
                    else if(w.charAt(i)>='0' && w.charAt(i)<='9')
                    digits++;
                    else
                    special++;
                }
            } 
            s=br.readLine();
            lines++;
        }
        spaces=words-lines;
        System.out.println("Lines:"+lines);
        System.out.println("Words:"+words);
        System.out.println("Characters:"+character);
        System.out.println("Spaces:"+spaces);
        System.out.println("Alphabets:"+alphabets);
        System.out.println("Digits:"+digits);
        System.out.println("Special characters(including Spaces):"+special);

        br.close();
    }
}