// 1. Write java program for reading input.txt and display the following results
// a. Count total number of words from input.txt
// b. Count total number of characters from input.txt
// c. Count total number of lines from input.txt
// d. Count total number of digits from input.txt
// e. Count total number of spaces from input.txt
// f. Count total number of special characters from input.txt
import java.io.*;
public class LAB6_1{
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("input.txt");
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
        FileReader f = new FileReader("input.txt");
        BufferedReader b = new BufferedReader(f);
        String StringLines[] = new String[lines];
        int words = 0, spaces = 0, upper = 0, lower = 0, special = 0, number = 0, character = 0, Alphabets = 0; // number
                                                                                                                // of
                                                                                                                // words
        for (int i = 0; i < lines; i++) {
            StringLines[i] = b.readLine();
            character =character+StringLines[i].length();
            for (int j = 0; j < StringLines[i].length(); j++) {
                if (StringLines[i].charAt(j) == ' ') {
                    spaces++;
                    special++;
                }
                else if (StringLines[i].charAt(j) >= 'A' && StringLines[i].charAt(j) <= 'Z') {
                    upper++;
                    Alphabets++;
                } 
                else if (StringLines[i].charAt(j) >= 'a' && StringLines[i].charAt(j) <= 'z') {
                    lower++;
                    Alphabets++;
                } 
                else if (StringLines[i].charAt(j) >= '0' && StringLines[i].charAt(j) <= '9')
                    number++;
                else
                    special++;
            }
        }
        words = spaces + lines;
        System.out.println("Words:" + words);
        System.out.println("Characters:" + character);
        System.out.println("Lines:" + lines);
        System.out.println("Digits" + number);
        System.out.println("Spaces:"+spaces);
        System.out.println("Special Characters:" + special);
        System.out.println("Alphabets:" + Alphabets);
        System.out.println("UpperCase Alphabets:" + upper);
        System.out.println("LoweCase Letters:" + lower);
        b.close();
        f.close();
    }
}
