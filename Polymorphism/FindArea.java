//Runtime polymorphism
class Figure{
	double dim1;
	double dim2	;
	Figure(double a,double b){
		dim1=a;
		dim2=b;
	}
	double area(){
		System.out.println("Area of figure");
		return 0;
	} 
}
class Rectangle extends Figure{
	Rectangle(double a,double b){
		super(a,b);
	}
	double area(){
		System.out.println("Area of rectangle");
		return dim1*dim2;
	}
}

class Triangle extends Figure{
	Triangle(double a,double b){
		super(a,b);
	}
	double area(){
		System.out.println("Area of Triangle");
		return (dim1*dim2)/2;
	}
}


class FindArea{
	public static void main(String[] args){
		/*Triangle t = new Triangle(10,8);
		System.out.println(t.area());
		
		Rectangle r = new Rectangle(10,8);
		System.out.println(t.area());*/
		
		
		//Dynamic Method Dispatch
		Figure f;//Reference object
		f=new Rectangle(9,5);//MEmory created -reference is assigned to f
		System.out.println(f.area());
		
		f=new Triangle(9,5);
		System.out.println(f.area());
		
		
	}




}
