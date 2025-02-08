import java.util.Scanner;
import java.io.*;
class InputValues{
	public static void main(String args[])throws IOException
	{
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=scan.nextInt();
		System.out.println("Enter Name:");
		String s=scan.next();
		System.out.println(s);
		System.out.println("Enter CGPA: ");
		float cg=scan.nextFloat();
		checkEven(n);
		System.out.println("CGPA is: "+cg);     */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Give  Number 1: ");
		String s=br.readLine();
		/*int a=Integer.parseInt(s);
		System.out.println("Give  Number 2: ");
		s=br.readLine();
		int b=Integer.parseInt(s);
		System.out.println("Give Number 3: ");
		s=br.readLine();
		int c=Integer.parseInt(s);
		checkMax(a,b,c);    */
		  int choice=0;
		do{
				System.out.println("Enter Percentage: ");
				s=br.readLine();
				double percentage=Double.parseDouble(s);
				calculateGrade(percentage);
			    System.out.println("Do You want to check another Person Grade?\t 1 for Yes\t 2 for No: ");
			    s=br.readLine();
			    choice=Integer.parseInt(s);
			}while(choice!=2);
		
	}
	static void checkMax(int a,int b,int c){
		if(a>b){
			if(a>c){
				System.out.println(a+" is Max");
			}
			else System.out.println(c+" is Max");
		}
		else if(b>c)
			System.out.println(b+" is Max");
		else System.out.println(c+" is Max");
	
	}
	
	static void calculateGrade(double percentage){
		String s="";
		  if((percentage>=90) && (percentage<=100)) {
			       s="EX";
			   }
			else if((percentage>=80)&&(percentage<90)){
				s="A";
			}
		  else if((percentage>=70)&&(percentage<80)){
				s="B";
			}
		else if((percentage>=60)&&(percentage<70)){
				s="C";
			}
		else if((percentage>=50)&&(percentage<60)){
			s="D";
		}
		else if((percentage>100)||(percentage<0)){
			s="IN";
		}
		else{ 
			s="R";
		}
		System.out.println("Grade: "+s);
	}
}
