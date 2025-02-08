import java.lang.*;
import java.util.*;
import java.io.*;
class Array01{
	static int[] sortBy(int arr[]){
		int n=arr.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		
		}
		return arr;
	}
	
	static boolean isPrime(int n){
		int p=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				p++;
				
			}
		}
		if(p==2){
			System.out.println(n+ " ");
			return true;}
		else return false;
	}
	
	
	

	
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ArraySize: ");
		int size=Integer.parseInt(br.readLine());
		Random rand = new Random();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			int current=rand.nextInt(500);
			arr[i]=current;
		
		}
		System.out.println("\n--------------Before sorting------------------- ");
		for(int i=0;i<size;i++){
			 System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n----------------After sorting--------------- ");
		int sorted[] = sortBy(arr);
		for(int i=0;i<size;i++){
			 System.out.print(sorted[i]+" ");
		}
		
		int eCount=0,eOdd=0;
		for(int i=0;i<size;i++){
			if(sorted[i]%2==0){
				eCount++;
			}
			else{
				eOdd++;	
			}
		
		}
		
		
		System.out.println("\nEven Numbers Count: "+eCount);
		System.out.println("\nOdd Numbers Count: "+eOdd);
		
		int pCount=0;	
		for(int i=0;i<size;i++){
			if(isPrime(sorted[i]))
				pCount++;
		}	
		System.out.println("Prime Numbers Count: "+pCount);
	
		
	
	}







}
