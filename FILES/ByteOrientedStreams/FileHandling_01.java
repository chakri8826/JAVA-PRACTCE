import java.util.*;
import java.io.*;

class FileHandling_01{
	public static void main(String[] args){
		
		try{
		
		//1st way to create a file
			/*File f=new File("abc.txt");
			System.out.println(f.exists()); // false
			System.out.println(f.createNewFile());  //true
			System.out.println(f.exists());   //false
			System.out.println(f.createNewFile());*/    //false
			
		//2nd way to create a file (to create a file in the desired directory
			/*File f=new File("/home/vishnu/Documents/chakri/Files/ByteOrientedStreams/directory","ab.txt");
			System.out.println(f.exists());
			System.out.println(f.createNewFile());
			System.out.println(f.exists());
			
			File f2 = new File("Folder");
			f2.mkdir(); //to create the folder*/
		
		//3rd way to create a file
			File f3 = new File("chakri");
			f3.mkdir();
			File f4 = new File(f3,"create.txt");    // creates create.txt in chakri folder
			f4.createNewFile();
			File f5 = new File(f3,"One");            //creates One folder in chakri folder
			f5.mkdir();
			 
		
			
		}
		catch(Exception e){
			System.out.println("Error occured: "+e);
		}	
	}










}
