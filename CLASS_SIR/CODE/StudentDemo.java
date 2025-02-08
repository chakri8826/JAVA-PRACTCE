class StudentDemo{
	public static void main(String args[]){
		System.out.println("Hello CSE....");
		 Student s1=new Student();
		 //s1.viewData();
		 s1.updateMail("raj@cmu");
		 s1.name="Raj";
		 s1.id="001";
		 s1.age=89;
		 s1.cgpa=9.8f;
		 s1.dept="Robotics";
		 s1.phone="111-222-111";
		  Student.campus="RKV";
		 s1.viewData();
		 s1.checkEligibility();
		   Student.m1();
		   s1.m1();
		//   Student.viewData();
		  Student s2=new Student();
		  
		
	}
}
