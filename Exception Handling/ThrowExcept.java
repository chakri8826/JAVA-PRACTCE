import java.util.*;
import java.lang.*;

class ThrowExcept{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try{
			checkAge(age);
		}
		catch(NullPointerException e){
			System.out.println("In Main "+e);	
		}
	
	}
	public static void checkAge(int age){
		try{
			if(age<18){
				throw new NullPointerException("Insufficient Age");
			}
			else{
				System.out.println("Eligible for voting");
			}
		}
		catch(NullPointerException e){
			System.out.println(e);	
			throw e;
		}
	}
	
	


}
