import java.io.*;
import java.lang.*;
import java.util.*;
class Noof_words_vowels{
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("words_vow.txt");	
		byte[] b = new byte[fis.available()];
		fis.read(b);
		String data = new String(b).trim();
		//System.out.println(data);
		int i=0,chars=0,vow=0,cse=0;
		
		String[] words = data.split(" ");
		for(int j=0;j<words.length;j++){
			 	System.out.println(j+". "+words[j]);
		}
		System.out.println("No.of Words are: "+words.length);
		
		while(i<data.length()){
			 if(data.charAt(i)!=' ' && data.charAt(i)!='.'){
			 	chars++;
			 }
			 char ch = data.charAt(i);
			 ch=Character.toLowerCase(ch);
			 if( ch=='a' || ch=='e' || ch=='i'  ||  ch=='o' ||  ch=='u'){
			 	vow++;	
			 }
			 i++;
		}
		System.out.println("No.of Chars are: "+chars);
		System.out.println("No.of vowels are: "+vow);
		
		for(int k=0;k<words.length;k++){
			String w = words[k];
			if(w.equals("cse")){
				cse++;
			}
		}
		System.out.println("No.of cse words are: "+cse);
	}
}









