package AM2;
import AM.m1;
public class m3 extends m1{
	public static void main(String[] args){
		m3 m = new m3();
		System.out.println(m.a);
		//System.out.println(m.b);      //private cant be accessed
		//System.out.println(m.c);
		System.out.println(m.d);       // protected can be accessed from outside class in derived class
	
	
	}
}





















