import java.util.*;
import java.lang.*;

class ThrowsExcept{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
		try{
			checkOne(age);
		}
		catch(IllegalAccessException e){
			System.out.println("In Main: "+e);
		}
	}
	
	static void checkOne(int age)throws IllegalAccessException{
		if(age<18){
			throw new IllegalAccessException("InSufficicent Age");
		}	
		else{
			System.out.println("Eligible");
		}
	
	}




}
