class Student{
	String name;
	String id;
	String dept;
	int age;
	float cgpa;
	String mail;
	String phone;
	static String campus;
	static void m1(){
		System.out.println("Campus: "+campus);
	}
	void viewData(){
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
		System.out.println(dept);
		System.out.println(cgpa);
		System.out.println(mail);
		System.out.println(phone);
		System.out.println(campus);
		
	}
	float getCgpa(){
		return cgpa;
	}
	void updateMail(String newMail){
		mail=newMail;
	}
	void checkEligibility(){
		if(cgpa>=5){
			    System.out.println("Eligible");
		}
		else System.out.println("Not Eligible");
	}
	
}
