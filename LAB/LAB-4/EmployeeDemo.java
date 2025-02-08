class Employee{
	String empname;
	int empcode;
	String address;
	long phno;
	double da=0.1;
	double hra=0.2;
	double basicPay;
	Employee(String empname,int empcode,String address,long phno,double basicPay){
		this.empcode=empcode;
		this.empname=empname;
		this.address=address;
		this.phno=phno;
		this.basicPay=basicPay;
	}
	public void computeSalary(){
		System.out.println("Salary of " + empname + " is to be calculated.");
	}
}


class Manager extends Employee{
	Manager(String empname,int empcode,String address,long phno,double basicPay){
		super(empname,empcode,address,phno,basicPay);
	}
	public void computeSalary(){
		super.computeSalary();
		double total=basicPay+(basicPay*da)+(basicPay*hra);
		System.out.println("Total Salary of " + empname + " is "+total);
	}
}

class Typist extends Employee{
	Typist(String empname,int empcode,String address,long phno,double basicPay){
		super(empname,empcode,address,phno,basicPay);
	}
	public void computeSalary(){
		super.computeSalary();
		double total=basicPay+(basicPay*da)+(basicPay*hra);
		System.out.println("Total Salary of " + empname + " is "+total);
	}




}

class EmployeeDemo{
	public static void main(String[] args){
		Manager m = new Manager("chakri",898,"Nandyal",939,6400);
		m.computeSalary();
		
		Typist t = new Typist("cherry",999,"Nandyal",894,5000);
		t.computeSalary();
	
	
	
	}

}





