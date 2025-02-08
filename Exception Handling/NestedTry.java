import java.lang.*;
import java.util.*;
class NestedTry{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<5;i++){
			System.out.print("Enter "+(i+1)+" value: ");
			arr[i]=sc.nextInt();
		}
		
		try{
			try{
				//runtime Exception
				System.out.println("Division is: "+(arr[4]/arr[2]));   
			}
			catch(ArithmeticException e){
				System.out.println("Division by zero not possible.");
			}
			arr[10]=50;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index is out of range");
		}
	
	}


}
