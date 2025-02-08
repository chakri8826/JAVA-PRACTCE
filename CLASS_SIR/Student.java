import java.util.*;
import java.lang.*;
class Student{
	String name;
	int age;
	double cgpa;
	Student next;
	Student(String name,int age, double cgpa){
		this.name=name;
		this.age=age;
		this.cgpa=cgpa;
		this.next=null;
	
	}
	public String toString(){
		return name+" "+age+" "+cgpa;
	
	}









}
