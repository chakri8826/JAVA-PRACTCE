import java.util.Scanner;
class SavingsDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter annual intrest: ");
		double anl=sc.nextDouble();
		System.out.println("Saver1 Balence: ");
		double sbal1=sc.nextDouble();
		System.out.println("Saver2 Balence: ");
		double sbal2=sc.nextDouble();
		//System.out.println("enter monthlyIntrest");
		//double month=sc.nextDouble();
		SavingsAccount s1=new SavingsAccount(anl,sbal1,sbal2);
		s1.calculateMonthlyIntrest();
		s1.Display();
		System.out.println("enter annual intrest: ");
		double annl=sc.nextDouble();
		SavingsAccount s2=new SavingsAccount(anl,sbal1,sbal2);
		s2.modifyInterestRate(annl);
		s2.calculateMonthlyIntrest();
		s2.Display();
	}
}
