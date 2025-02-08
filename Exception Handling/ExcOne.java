import java.util.*;
import java.lang.*;

class ExcOne{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int arr[]={2,4,6,8,9,1};
		try{
			int c =a/b;
			System.out.println("output: "+arr[c]);
		}
		/*catch(Exception e){
			System.out.println("Exception identified is: "+e);
		}*/
		catch(ArithmeticException e){
			System.out.println("Exception in arthmetic is: "+e);
		
		}
		 
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Array Exception is: "+ae);
		}
		
		System.out.println("Next lines after catching");
		
			
		
		
		
		
	}

}
