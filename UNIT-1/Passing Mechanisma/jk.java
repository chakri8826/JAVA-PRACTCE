import java.util.*;
import java.lang.*;
class jk{
	int a,b;
	jk(int a,int b){
		System.out.println("Double parameter Constructor");
		this.a=a;
		this.b=b;
		System.out.println("this.a "+this.a+" this.b "+this.b);
	}
	jk(){
	   	System.out.println("default Constructor");
	}
	jk(jk l){
		System.out.println("single parameter object Constructor");
		System.out.println("with object parameter this: "+this.a+"this.b "+this.b);
		System.out.println("with object parameter object: "+l.a+"Object b "+l.b);
		l.a=this.a+l.b;
		this.b=l.a+this.b;
		System.out.println("single parameter object constructor after processing");
		System.out.println("with object parameter this: "+this.a+"this.b "+this.b);
		System.out.println("with object parameter object: "+l.a+"Object b "+l.b);
	}
	void m1(jk y){
		System.out.println("method with single parameter object ");	
		System.out.println("with object parameter object: "+y.a+"Object b "+y.b);
		System.out.println("with object parameter this: "+this.a+"this.b "+this.b);
	}
	void m(int p){
		System.out.println("method with single parameter value ");	
		this.a=p;
		System.out.println("with object parameter this: "+this.a+" this.b "+this.b);
		System.out.println("with object parameter this: "+a+" this b "+b);
	}
}
class jkDemo{
	public static void main(String[] args){
		jk j1=new jk(5,6);
		j1.m(10);
		jk j2 = new jk();
		jk j3 = new jk(j1);//Object passing
		j3.m1(j1);
		jk j4=j1;//Object copy
		System.out.println("with j4 Object: "+j4.a+" this b"+j4.b);
		System.out.println("with j1 Object: "+j1.a+" this b"+j1.b);
	}
}
