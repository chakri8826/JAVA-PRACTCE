import java.io.*;
public class LAB6_2DecryptFile {
    public static void main(String[] args)throws IOException {
        FileReader fr=new FileReader("Encrypted.txt");
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("Decrypted.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        String S=br.readLine(),s="";
        while(S!=null){
            for(int i=0;i<S.length();i++){
                int ascii=(int)S.charAt(i);
                ascii=ascii-3;
                if(ascii==94){
                    s=s+"x";
                }
                else if(ascii==95){
                    s=s+"y";
                }
                else if(ascii==96){
                    s=s+"z";
                }
                else{
                    s=s+(char)ascii;
                }
                
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
