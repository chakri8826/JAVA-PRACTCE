//accessing inner class from static method of same class
import java.lang.*;
import java.util.*;
public class InnerStatic{
	int x=10;
	static int y=20;
	class Inner{
		void p(){
			System.out.println("Innner class method p");
			System.out.println("x value:"+x+" y value:"+y);
		
		}
	
	}
	public static void main(String[] args){
		//new InnerStatic().new Inner().p();
		InnerStatic is = new InnerStatic();
		InnerStatic.Inner o =  is.new Inner();
		o.p();
	}
	
}



