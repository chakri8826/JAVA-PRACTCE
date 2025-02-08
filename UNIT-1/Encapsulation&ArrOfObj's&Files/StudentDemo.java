import java.util.*;
import java.lang.*;
import java.io.*;
class StudentDemo{
	public static void main(String[] args)throws IOException{
		
		Student studs[] = new Student[10];
		int ind=0;
		FileReader fr = new FileReader("data.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line="";
		while((line=br.readLine())!=null){
			StringTokenizer st= new StringTokenizer(line," ");
			String name=st.nextToken();
			int age=Integer.parseInt(st.nextToken());
			double salary = Double.parseDouble(st.nextToken());
			
			studs[ind]=new Student();
			studs[ind].setName(name);
			studs[ind].setAge(age);
			studs[ind].setSalary(salary);
			ind++;
		}
		fr.close();
		br.close();
		System.out.println("---------------------Before Sorting-------------------------");
		for(int i=0;i<ind;i++){
			System.out.println(studs[i]);
		}
		
		//Sorting by name of the student
		for(int i=0;i<ind;i++){
			for(int j=0;j<ind-1-i;j++){
				if(studs[j].getName().compareTo(studs[j+1].getName())>0){
					Student temp=studs[j];
					studs[j]=studs[j+1];
					studs[j+1]=temp;
				}
				
			}
		}
		
		System.out.println("---------------------After Sorting-------------------------");
		for(int i=0;i<ind;i++){
			System.out.println(studs[i]);
		}
		
		
		//Writing the Sorted list to "out" file
		FileWriter fw = new FileWriter("out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i=0;i<ind;i++){
			bw.write(studs[i].toString()+"\n");
		}
		
		bw.close();
		fw.close();
		
	}

}





