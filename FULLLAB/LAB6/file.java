import java.io.*;
import java.util.StringTokenizer;

public class file {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("revanth.txt");
        BufferedReader br = new BufferedReader(fr);
        String S;
        int lines = 0;// count of lines
        do {
            S = br.readLine();
            if (S != null) {
                lines++;
            }
        } while (S != null);
        br.close();
        fr.close();
        FileReader f = new FileReader("revanth.txt");
        BufferedReader b = new BufferedReader(f);
        String array[] = new String[lines];
        int words = 0, spaces = 0; // number of words
        for (int i = 0; i < lines; i++) {
            array[i] = b.readLine();
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == ' ')
                    spaces++;
            }
        }
        words = spaces + lines;
        String wordArray[] = new String[words];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            StringTokenizer st = new StringTokenizer(array[i]);
            while (st.hasMoreTokens()) {
                wordArray[index] = st.nextToken();
                index++;
            }
        }
        for (int i = 0; i < words-1; i++) {
            for (int j = i + 1; j < words; j++) {
                if(wordArray[i].compareTo(wordArray[j])>0)
                {
                    String temp=wordArray[i];
                    wordArray[i]=wordArray[j];
                    wordArray[j]=temp;
                }
            }
        }
        b.close();
        f.close();
        FileWriter fw = new FileWriter("revanthSort.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i=0;i<words;i++)
        {
            bw.write(wordArray[i]+"\n");
        }
        bw.close();
        fw.close();
    }
}
