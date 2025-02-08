import java.util.Scanner;
import java.lang.Math;
class NumericInput{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(n);
		int evenCount=0;
		int oddCount=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				int z=Math.pow();
				System.out.println(i+" is Even...");
				evenCount++;
			}
			else{ 
				System.out.println(i+" is Odd...");
				oddCount++;
			}
		}
		System.out.println("Even Numbers Count: "+evenCount);
		System.out.println("Odd Numbers Count: "+oddCount);
	}
	public static int pow(int base,int p){
		int val=1;
		for(int i=1;i<=p;i++){
			val =val*base;
		}
		return val;
	}
}
