import java.util.*;
import java.lang.*;
class StudentListDemo{
	public static void main(String[] args){
		StudentList sigma = new StudentList();
		sigma.insert("tharun",21,8.97);
		sigma.insert("chakri",20,8.8);
		sigma.insert("vishnu",22,8.9);
		sigma.insert("abhi",23,9.9);
		
		
		sigma.traversal();
		 
		
		//sigma.delete("abhi");    //---> 1st meth which doesn't useful for future insertions
		sigma.delete1("abhi");     //-->  2nd meth which is useful for future insertions 
		
		sigma.insert("cherry",18,9.9);
		
		System.out.println("------After Deleting--------");
		sigma.traversal();
		
		//System.out.println(sigma.getSize());
		
		 /*sigma.sortByName();
		System.out.println("-----After Sorting By name---------");
		sigma.traversal();*/
		
	
		 
	}






}
