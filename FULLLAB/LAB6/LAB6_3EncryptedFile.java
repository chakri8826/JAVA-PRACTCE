// 2. Write a Java program to read data from file and write data into file.
// A simple encryption scheme is to interchange letters of the alphabet on
// a one-to-one basis. This scheme can be accomplished with a translation table
// for the lowercase and uppercase letters. Write a program that uses such a
// scheme to encode text. If you‟re interested, learn about a more secure
// encryption system and then program it.
// Note: treat numbers, spaces, and special chars as same.
// Original: a b c d e f g h i j k l m n o p q r s t u v w x y z
// Encryption Table: d e f g h i j k l m n o p q r s t u v w x y z a b c
import java.io.*;
public class LAB6_3EncryptedFile {
    public static void main(String[] args)throws IOException {
        FileReader fr=new FileReader("Main.txt");
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("Encrypted.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        String S=br.readLine(),s="";
        while(S!=null){
            for(int i=0;i<S.length();i++)
            {
                int ascii=(int)S.charAt(i);
                ascii=ascii+2;
                s=s+(char)ascii;
                
            }
            S=br.readLine();
        }
        bw.write(s);
        bw.close();
        fw.close();
        br.close();
        fr.close();

       
        
    }

    
}
