class SavingsAccount{
	public static double annualInterest;
	private double savingBal1;
	private double savingBal2;
	private double monthlyIntrest1;
	private double monthlyIntrest2;
	//SavingsAccount s1=new SavingsAccount();
	SavingsAccount(double annualInterest,double savingBal1,double savingBal2){
		this.annualInterest=annualInterest;
		this.savingBal1=savingBal1;
		this.savingBal2=savingBal2;
//		this.monthlyIntrest=monthlyIntrest;
	}
	public void calculateMonthlyIntrest(){
		monthlyIntrest1=(savingBal1*annualInterest)/12;
		monthlyIntrest2=(savingBal2*annualInterest)/12;
		//System.out.println(monthlyIntrest1);
		//System.out.println(monthlyIntrest2);
		savingBal1=savingBal1+monthlyIntrest1;
		savingBal2=savingBal2+monthlyIntrest2;
		//System.out.println(savingBal1);
		//System.out.println(savingBal2);
	}
	public static void modifyInterestRate(double annual){
		annualInterest=annual;
	}
	public void Display(){
		System.out.println("Annual rate: "+annualInterest+"\nSaver1 Balence: "+savingBal1+"\nSaver2 Balence: "+savingBal2+"\n monthlyIntrest: "+monthlyIntrest1+"\nmonthlyIntrest: "+monthlyIntrest2);
	}
}
