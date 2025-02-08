import java.lang.*;
import java.util.*;
class ThrowKeyword extends RuntimeException{
	public static void main(String[] args){
		//creating Exception for our own class
		//throw new ThrowKeyword();
		
		
		throw new ArithmeticException("Some problem");	
	}
}
