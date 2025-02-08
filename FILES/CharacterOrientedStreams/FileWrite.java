import java.io.*;
import java.util.*;
import java.lang.*;
class FileWrite{
	public static void main(String[] args)throws Exception{
		//FIRST SYNTAX
		/*FileWriter fw = new FileWriter("writeOutput.txt");
		fw.write(100);
		fw.flush();
		System.out.println((char)fw)
		*/
	
		//SECOND SYNTAX
		/*File f = new File("writeOutput.txt");
		FileWriter fw = new FileWriter(f,true);
		fw.write(100);
		fw.flush();
		System.out.println((char)fw)
		*/
		
		//THIRD SYNTAX
		/*File f = new File("writeOutput.txt");
		FileWriter fw = new FileWriter(f);
		char[] ch={'c','h','a','k','r','i'};
		fw.write(ch,0,2);
		String s = "Chakradhar";
		fw.write(s);
		fw.flush();
		*/
		
		//Ex for Reader and writer
		File f = new File("ReadWrite.txt");
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		fw.write("Ex for Reader and writer");
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader(f);
		char[] ch = new char[(int)f.length()];
		fr.read(ch);
		int i=0;
		while(i<ch.length){
			System.out.print((char)ch[i]);
			i++;
		}
		fr.close();
	
	
	
	}
}
