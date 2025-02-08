class HourlyEmployee extends Employee{
	private double rate;
	private double workingHours;
	private double salary=0;
	//HourlyEmployee(double rate,double workingHours){
	HourlyEmployee(String empCode,String fname,String sname,double rate,double workingHours){
		super(empCode,fname,sname);
		this.rate=rate;
		this.workingHours=workingHours;
	}
	public double pay(){
		salary=rate*workingHours;
		return salary;
	}
}
