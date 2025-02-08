import java.lang.*;
import java.util.*;
class Except{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();
		
		int arr[] = new int[5];
		for(int i=0;i<5;i++){
			System.out.print("Enter "+(i+1)+" value: ");
			arr[i]=sc.nextInt();
		}
		
		
		try{
			System.out.println("a/b is: "+a/b);
			System.out.println(arr[0]);
			System.out.println("try block executed successfully");
		}
		
		/*catch(ArithmeticException e){
			System.out.println("Division by zero not possible.");
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index is out of range");
		}*/
		catch(Exception e){
			System.out.println("Error occured is: "+e);
			//System.out.println(e.getMessage());    //-->tells only the nature of the Exception
			//e.printStackTrace();     //--> tells both the nature of the Exception, Name of exception and line number.
		}
		
		finally{
			System.out.println("Program executed to last line");
		}
	
	
	
	
	
	}


}
