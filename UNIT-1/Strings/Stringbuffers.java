import java.lang.*;
import java.util.*;
public class Stringbuffers{
	public static void main(String[] args){
		/*
		StringBuffer sb = new StringBuffer("cse");
		StringBuffer sb1 = new StringBuffer("cse");
		System.out.println(sb.equals(sb1));
		System.out.println(sb==sb1);
		System.out.println(sb.toString().equals(sb1.toString()));*/
		
		StringBuffer sb = new StringBuffer("cse");
		System.out.println("Length: "+sb.length());
		System.out.println("Length+Buffer: "+sb.capacity());
		sb.insert(1,"Computer");
		System.out.println("Inserting: "+sb);
		sb.deleteCharAt(8);
		System.out.println("Deleting: "+sb);
		sb.delete(1,8);
		System.out.println("Deleting Group: "+sb);
		sb.replace(1,3,"chakri");
		System.out.println("Replaceing: "+sb);
		System.out.println("-----------");
		String s ="cse";
		s.concat("likes");
		System.out.println("String: "+s);
		
		sb.append("likes");
		System.out.println("String: "+sb);
		
	}
}


