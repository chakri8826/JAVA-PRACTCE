import java.util.Scanner;
class pb2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee code:");
		String ecode=sc.next();
		System.out.print("Enter first name:");
		String fn=sc.next();
		System.out.print("Enter second name:");
		String sn=sc.next();
		System.out.print("Enter whether \n1.Hourly employee  2.Salaried employee \nEnter your option:");
		int emp=sc.nextInt();
		if(emp==1)
		{
			System.out.print("Enter rate:");
			double rate=sc.nextDouble();
			System.out.print("Enter working Hours:");
			double wh=sc.nextDouble();
			Employee h1=new HourlyEmployee(ecode,fn,sn,rate,wh);
			System.out.println(h1.pay());
		}
		else if(emp==2){
			System.out.print("Enter commission rate:");
			double cr=sc.nextDouble();
			System.out.print("Enter gross salary:");
			double gs=sc.nextDouble();
			System.out.print("Enter basics:");
			double basics=sc.nextDouble();
			Employee s1=new SalariedEmployee(ecode,fn,sn,cr,gs,basics);
			System.out.println(s1.pay());
		}
		sc.close();
	}
}
