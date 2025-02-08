class SalariedEmployee extends Employee{
	private double commissionRate;
	private double grossSales;
	private double basic;
	private double salary=0;
	//SalariedEmployee(double commissionRate,double grossSales,double basic);
	SalariedEmployee(String empCode,String fname,String sname,double commissionRate,double grossSales,double basic){
		super(empCode,fname,sname);
		this.commissionRate=commissionRate;
		this.grossSales=grossSales;
		this.basic=basic;
	}
	public double pay(){
		salary=commissionRate*grossSales+basic;
		return salary;
	}
}
		

