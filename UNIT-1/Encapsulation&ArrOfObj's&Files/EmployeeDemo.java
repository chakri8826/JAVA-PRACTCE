import java.util.*;
import java.lang.*;
import java.io.*;
class EmployeeDemo{
	public static void main(String[] args)throws IOException{
		FileReader fr = new FileReader("inp.txt");
		BufferedReader br = new BufferedReader(fr);
		String line="";
		Employee emps[] = new Employee[10];
		int ind=0;
		while((line=br.readLine())!=null){
			//StringTokenizer st = new StringTokenizer(line," ");
			StringTokenizer st= new StringTokenizer(line," ");
			String name=st.nextToken();
			int age=Integer.parseInt(st.nextToken());
			double salary = Double.parseDouble(st.nextToken());
			String role = st.nextToken();
			
			emps[ind]=new Employee();
			emps[ind].setName(name);
			emps[ind].setAge(age);
			emps[ind].setSalary(salary);
			emps[ind].setRole(role);
			ind++;
		}
		fr.close();
		br.close();
		
		System.out.println("---------------------Before Sorting-------------------------");
		for(int i=0;i<ind;i++){
			System.out.println(emps[i]);
		}
		
		
		for(int i=0;i<ind;i++){
			for(int j=0;j<ind-1-i;j++){
				if(emps[j].getName().compareTo(emps[j+1].getName())>0){
					Employee temp = emps[j];
					emps[j]=emps[j+1];
					emps[j+1]=temp;
				}
			}
		
		}
		
		System.out.println("---------------------After Sorting-------------------------");
		for(int i=0;i<ind;i++){
			System.out.println(emps[i]);
		}
	
	
		FileWriter fw = new FileWriter("out1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i=0;i<ind;i++){
			bw.write(emps[i].toString()+"\n");
		}
		
	
		bw.close();
		fw.close();
	
	
	
	}














}
