import java.util.*;
import java.util.*;
import java.io.*;
class CalcDemo{
	public static void main(String[] args)throws IOException{
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(in);
	Calc obj=new Calc();
	int n=1;
	do{
		System.out.println("Enter 1st Value: ");
		double a = Double.parseDouble(br.readLine());
		
		System.out.println("Enter 2st Value: ");
		double b = Double.parseDouble(br.readLine());
		
		System.out.println("Choose your option: +.Add ,-.Sub ,*.Mul ,/.Div ,%.Modulus ,^.pow: ");	
		String s = br.readLine();
		char c=s.charAt(0);
		 
		double value=0;
		
		switch(c){
			case '+':
				value=obj.sum(a,b);
			 	break;
			case '-':
				value=obj.sub(a,b);
			 	break;
			case '*':
				value=obj.mul(a,b);
			 	break;
			case '/':
				value=obj.div(a,b);
			 	break;
			case '%':
				value=obj.modulus(a,b);
			 	break;
			case '^':
				value=obj.power(a,b);
			 	break;
			default:
				System.out.println("Invalid Operator.");
			 
		}
		System.out.println("Answer: "+value);
		System.out.println("Do u want to Continue(0,1): ");
		n=Integer.parseInt(br.readLine());
	}while(n!=0);
		
	
	
	}











}

