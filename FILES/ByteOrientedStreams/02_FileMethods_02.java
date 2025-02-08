import java.io.*;
import java.util.*;
class FileMethods_02{
	public static void main(String[] args) throws Exception{
		File f = new File("methods.txt");
		f.createNewFile();
		System.out.println("Size: "+f.length());
		//System.out.println("Deleted: "+f.delete());
		
		
		File f2 = new File("chakri");
		f2.mkdir();
		File f3 = new File(f2,"one.txt");
		File f4 = new File(f2,"one");
		File f5 = new File(f2,"Two");
		f3.createNewFile();
		f4.mkdir();
		f5.mkdir();
		
		File f1 = new File("/home/vishnu/Documents/chakri/Files/chakri");
		String s[] = f1.list();
		System.out.println("\nList of files and directories are: ");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i] );
		}
		
		System.out.println("\nList of files are: ");
		int files=0,directories=0;
		for(int i=0;i<s.length;i++){
			File f6= new File(f1,s[i]);
			if(f6.isFile()){
				System.out.println(s[i] );
				files++;
			}
			else{
				directories++;
			}
		}
		System.out.println("Total No.of files are: "+s.length);
		System.out.println("No.of files are: "+files);
		System.out.println("No.of directories are: "+directories);
		
		
	
	}



}

