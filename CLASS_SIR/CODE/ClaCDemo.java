import java.io.*;
class ClaCDemo{
	public static void main(String args[])throws IOException
	{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  CalC obj=new CalC();
		  int opt=0;
		 do{
			 System.out.println("Enter 1st Value: ");
			 String line=br.readLine();
			 double first=Double.parseDouble(line);
			 System.out.println("Enter 2nd Value: ");
			 double second=Double.parseDouble(br.readLine());
			 System.out.println("Select Operator from the Given below\n + for Add\t - for Sub\t * for Multi\t \\ for Div\t % for Modulus\t  ^ for Pow:\t");
			 String s=br.readLine();
			 char c=s.charAt(0);
			  double value=0;
			 switch(c){
				 case '+':
					value=obj.sum(first,second);
					break;
				case '-':
					value=obj.sub(first,second);
					break;
				case '*':
					value=obj.multi(first,second);
					break;
				case '/':
					value=obj.div(first,second);
					break;
				case '%':
					value=obj.modulus(first,second);
					break;
				case '^':
					value=obj.pow(first,second);
					break;
				default:
					System.out.println("Invalid Operator...");
			}
			System.out.println("OutPut: "+value);
			 
		System.out.println("Do you want to Continue? 1 for Yes\t 2 for No: ");
		opt=Integer.parseInt(br.readLine());	 		 
		 }while(opt!=2);
	}
}
