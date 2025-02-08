import java.util.Scanner;
class SavingsDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter annual intrest: ");
		double anl=sc.nextDouble();
		System.out.println("Savings Balence: ");
		double sbal=sc.nextDouble();
		System.out.println("enter monthlyIntrest");
		double month=sc.nextDouble();
		SavingsAccount s1=new SavingsAccount(anl,sbal,month);
		s1.calculateMonthlyIntrest();
		s1.Display();
	}
}
