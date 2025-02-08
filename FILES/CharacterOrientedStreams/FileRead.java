import java.io.*;
import java.util.*;
import java.lang.*;
class FileRead{
	public static void main(String[] args)throws Exception{
		//FIRST SYNTAX
		/*FileReader fr = new FileReader("readInput.txt");
		int i = fr.read();
		while(i!=-1){
			System.out.print((char)i);
			i=fr.read();
			
		}*/
		
		//SECOND SYNTAX
		File f = new File("readInput.txt");
		FileReader fr = new FileReader(f);
		/*int i = fr.read();
		while(i!=-1){
			System.out.print((char)i);
			i=fr.read();
			
		}*/
		
		char[] ch = new char[(int)f.length()];
		fr.read(ch);
		for(int i=0;i<ch.length;i++){
			System.out.print((char)ch[i]);
		}
		
	
	
	
	}





}
