public abstract class Employee{
	private String empCode;
	private String fname;
	private String sname;
	Employee(String empCode,String fname,String sname){
		this.empCode=empCode;
		this.fname=fname;
		this.sname=sname;
	}
	public abstract double pay();
}
