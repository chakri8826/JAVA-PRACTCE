import java.io.*;
class Example_On_Read_Write_05{
	public static void main(String[] args)throws Exception{
	//WRITING DATA TO FILE BY TAKING FILE NAME AS INPUT THROUGH COMMAND LINE ARGUMENT
	/*	String f = args[0];
		FileInputStream fis = new FileInputStream(f);//f is file name
		byte[] b = new byte[fis.available()];
		fis.read(b);
		System.out.println("copying....");
		FileOutputStream fos = new FileOutputStream("exam.txt",true);
		fos.write(b);
		System.out.println("Successfully written");
		fis.close();
		fos.close();
	*/
	
	//COPYING IMAGE and VIDEOS OF ONE FOLDER TO ANOTHER FOLDER
	//FileInputStream fis = new FileInputStream("A.jpg"); //Image copying
	FileInputStream fis = new FileInputStream("Screencast from 31-03-24 11:45:48 AM IST.webm");
	byte[] b = new byte[fis.available()];
	fis.read(b);
	System.out.println("copying....");
	//FileOutputStream fos = new FileOutputStream("/home/vishnu/Documents/chakri/Files/Copies/B.jpg");
	FileOutputStream fos = new FileOutputStream("/home/vishnu/Documents/chakri/Files/Copies/vid.webm");
	fos.write(b);
	System.out.println("Successfully written");
	fis.close();
	fos.close();
	
	
	
	
	
	
	}
}

	
