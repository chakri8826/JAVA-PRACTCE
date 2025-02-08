public class Demo {
    public static void main(String[] args) {
        SavingsAccount s1=new SavingsAccount();
        SavingsAccount s2=new SavingsAccount();
        s1.deposit(2000.00);
        s2.deposit(3000.00);
        System.out.println("Initial balance");
        System.out.println("saver 1:"+s1);
        System.out.println("saver 2:"+s2);
        System.out.println("After adding 4% interest rate");
        SavingsAccount.setInterestRate(4);
        System.out.println("saver1 monthly interest:"+s1.calculateMonthlyInterest());
        System.out.println("saver2 monthly interest:"+s2.calculateMonthlyInterest());
        System.out.println("updated balance after adding interests");
        System.out.println("saver 1:"+s1);
        System.out.println("saver 2:"+s2);
        System.out.println("After adding 5% interest rate");
        SavingsAccount.setInterestRate(5);
        System.out.println("saver1 monthly interest:"+s1.calculateMonthlyInterest());
        System.out.println("saver2 monthly interest:"+s2.calculateMonthlyInterest());
        System.out.println("updated balance after adding interests");
        System.out.println("saver 1:"+s1);
        System.out.println("saver 2:"+s2);
    }   
}
