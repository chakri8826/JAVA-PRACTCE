import java.io.*;
class Reading_03{
	public static void main(String[] args) throws Exception{
		//FIRST SYNTAX
		
		/*FileInputStream fis = new FileInputStream("FileMethods.java");
		int i=fis.read();
		System.out.println("The readed data is "+(char)i);
		
		int j=0;
		while((j=fis.read())!=-1){
			System.out.print((char)j);
		}
		
		
		//SECOND SYNTAX
		
		File f=new File("methods.txt");
		f.createNewFile();
		FileInputStream  fis = new FileInputStream(f);
		int j=0;
		while((j=fis.read())!=-1){
			System.out.print((char)j);
		}
		fis.close();*/
		
		//THIRD SYNTAX (storing the data into the array)
		File f=new File("read.txt");
		f.createNewFile();
		FileInputStream  fis = new FileInputStream(f);
		byte[] b = new byte[fis.available()];
		fis.read(b);
		/*for(int i=0;i<b.length;i++){
			System.out.print((char)b[i]);
		
		}*/
		String data = new String(b);   //conversion of byte Array to String data
		System.out.print(data);
		fis.close();
		
		
		 
		
		
		
		
		
	}

	
}






