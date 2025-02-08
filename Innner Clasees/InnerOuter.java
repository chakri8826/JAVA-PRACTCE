//accessing inner class from  outer class
import java.lang.*;
import java.util.*;

class Jk{
	int x=10;
	static int y=20;
	class Inner{
		void p(){
			System.out.println("Innner class method p");
			System.out.println("x value:"+x+" y value:"+y);
		}
	}
}

class InnerOuter{
	public static void main(String args[]){
		new Jk().new Inner().p();
		Jk j = new Jk();
		Jk.Inner i = j.new Inner();
		i.p();
	}
	
	 
	
	
}



