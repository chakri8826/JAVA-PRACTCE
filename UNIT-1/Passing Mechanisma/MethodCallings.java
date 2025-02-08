import java.lang.*;
import java.util.*;
class MethodCallings{
	void instance(){
		System.out.println("First Instance Meth");
		//MethodCallings.statMeth(); //Rule3
	}
	void instance2(){
		instance(); //Rule2
		System.out.println("Second Instance Meth");
	}
	static void statMeth(){
		System.out.println("First Static Method");
		
		MethodCallings obj = new MethodCallings();
		obj.instance();//Rule4
	}
	static void statMeth2(){
		statMeth();
		System.out.println("Second Static Method");
	}
	public static void main(String[] args){
		MethodCallings mc = new MethodCallings();
		//mc.instance2();
		//mc.statMeth2();
		statMeth();//Rule1
		
		//mc.instance();
	}




}
