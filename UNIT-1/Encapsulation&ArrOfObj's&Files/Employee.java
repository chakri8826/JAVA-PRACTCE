class Employee{
	private String name;
	private int age;
	private double salary;
	private String role;
	
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public void setRole(String role){
		this.role=role;
	}
	
	public String getName(){
		return name;
	}
	public int getage(){
		return age;
	}
	public double getsalary(){
		return salary;
	}
	public String getRole(){
		return role;
	}
	
	public String toString(){
		return "Name:"+name+"  Age:"+age+"  Salary:"+salary+"  Role: "+role;
	}
}

