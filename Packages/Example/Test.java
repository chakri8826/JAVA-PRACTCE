import java.util.Scanner;
import Arithmetic.Add;
import Arithmetic.arr2.Sub;
import Arithmetic.arr2.Outer;

class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Values: ");
		double s1 = sc.nextDouble();
		double s2 = sc.nextDouble();
		Add a = new Add();
		double s =a.add(s1,s2);
		System.out.println("Addition is: "+s);
		
		Sub m = new Sub();
		m.sub();
		
		Outer o = new Outer();
		o.show();
		
		Outer.Inn oi = o.new Inn();    //Creating obj for Inner class.
		oi.display();
		
		
	}





}
