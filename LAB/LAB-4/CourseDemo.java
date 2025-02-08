import java.util.*;
import java.lang.*;
class Course{
	private String name;
	private String id;
	private String duration;
	
	public void setName(String name){
		this.name=name;
	}
	public void setId(String id){
		this.id=id;
	}
	public void setDuration(String duration){
		this.duration=duration;
	}
	public  String getName(){
		return name;
	}
	public  String getId(){
		return id;
	}
	public String duration(){
		return duration;
	}
	
	public String toString(){
		return "Course Name: "+name+"  Course Id: "+id+"  Course Duration: "+duration;
	}
}

class CourseDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of 5 Courses");
		Course c[] = new  Course[5];
		for(int i=0;i<5;i++){	 
			c[i]=new Course();
			System.out.println("Enter the name of the Course "+(i+1));
			String name=sc.nextLine();
			System.out.println("Enter the Id of the Course "+i+1);
			String id=sc.nextLine();
			System.out.println("Enter the duration of the Course "+i+1);
			String duration=sc.nextLine();
			c[i].setName(name);
			c[i].setId(id);
			c[i].setDuration(duration);
		}
		
		System.out.println("Details of the Courses are: ");
		for(int i=0;i<5;i++){
			System.out.println(c[i]);
		}
			
			 
	}
	
	
		
	
	
	
	
	



}
