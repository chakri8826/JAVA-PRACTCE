








import java.util.*;
import java.lang.*;
import java.io.*;
class DataProcess{
	public static void main(String[] args)throws IOException{
			FileReader fr = new FileReader("Encapsulation.txt");
			BufferedReader br = new BufferedReader(fr);
			String line="";
			String words[]=new String[300];
			int ind =0;
			while((line=br.readLine())!=null){
				//System.out.println(line);
				StringTokenizer st= new StringTokenizer(line,", .");
				while(st.hasMoreTokens()){
					words[ind++]=st.nextToken();
				}
			}
			
			String word = "the";
			int count=0;
			for(int i=0;i<ind;i++){
				if(words[i].equals("the")){
					count++;
					System.out.println(words[i]);
				}
				
			}
			System.out.println("Frequency of "+word+" is: "+count);
			br.close();
			fr.close();
	
	



	}





}
