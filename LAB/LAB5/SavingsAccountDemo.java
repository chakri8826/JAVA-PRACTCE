class SavingsAccount{
	static double air=0;
	private double sBalance=0;
	SavingsAccount(double initialBalance){
		sBalance= initialBalance;
	}
	public void calculateMonthlyInterest(){
		double b = (sBalance*air)/12;
		sBalance+=b;
		System.out.println(sBalance);
	}
	public static void modifyInterestRate(double newVal){
		air=newVal;
	}
}

class SavingsAccountDemo{
	public static void main(String[] args){
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		SavingsAccount.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
	
	
	}



}
