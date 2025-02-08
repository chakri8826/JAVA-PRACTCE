//accessing inner class from instance method of outer class
import java.lang.*;
import java.util.*;
public class InnerInstance{
	int x=10;
	static int y=20;
	class Inner{
		void p(){
			System.out.println("Innner class method p");
			System.out.println("x value:"+x+" y value:"+y);
		
		}
	
	}
	
	void p2(){
		Inner i = new Inner();
		i.p();
	
	
	}
	public static void main(String[] args){
		InnerInstance is = new InnerInstance();
		is.p2();
		 
	}
	
}



