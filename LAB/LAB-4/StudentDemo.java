import java.util.*;
import java.lang.*;
abstract class Student{
	String name;
	String id;
	double grade;
	int age;
	String address;	
	Student(String name,String id,double grade,int age,String address){
		this.name=name;
		this.id=id;
		this.grade=grade;
		this.age=age;
		this.address=address;
	
	}
	abstract public boolean isPassed(double grade);
}

class Undergrad extends Student{
	Undergrad(String name,String id,double grade,int age,String address){
		super(name,id,grade,age,address);
	}
	public boolean isPassed(double grade){
		return grade>70.0;
	}

}

class Grad extends Student{
	Grad(String name,String id,double grade,int age,String address){
		super(name,id,grade,age,address);
	}
	public boolean isPassed(double grade){
		return grade>80.0;
	}
	
}


class StudentDemo{
	public static void main(String[] args){
		Undergrad ug = new Undergrad("Chakri", "67890", 95.0, 20, "Rkvalley");
		Grad g = new Grad("Satish", "12345", 85.0, 25, "Rkvalley");

		System.out.println("Undergrad student " + ug.name + " passed the course: " +ug.isPassed(ug.grade));		
		System.out.println("Grad student " + g.name + " passed the course: " + g.isPassed(g.grade));

	}
}
