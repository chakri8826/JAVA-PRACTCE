//import java.util.*;
//import java.lang.*;
class GarbageCollector{
	public static void main(String[] args){
		GarbageCollector gc = new GarbageCollector();
		System.out.println("Address: "+gc.hashCode());
		gc = null;
		System.gc();
	}
	
	protected void finalize(){
		System.out.println("finalize method called");
	}







}
