import java.io.*;
class Writing_04{
	public static void main(String[] args) throws Exception{
		//FIRST SYNTAX
	   	/*FileOutputStream fos = new FileOutputStream("output.txt");
	   	fos.write('i');
	   	fos.write('n');
	   	fos.write('g');
	   	System.out.println("written succesfully");
	   	
	   	//SECOND SYNTAX
	   	File f = new File("output.txt");
	   	FileOutputStream fos = new FileOutputStream(f,true);
	   	fos.write('r');
	   	System.out.println("written succesfully");*/
	   	
	   	
	   	//THIRD SYNTAX
		File f = new File("output.txt");
	   	FileOutputStream fos = new FileOutputStream(f,true);
	   	String s = " Chakri is a wise person";
	   	byte[] b = s.getBytes();
	   	fos.write(b);
	   	System.out.println("written succesfully");		   	
	   	fos.close();
	   	
	}
}

