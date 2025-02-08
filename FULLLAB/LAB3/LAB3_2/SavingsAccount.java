public class SavingsAccount{
    static double annualInterestRate;
    private double savingsBalance=0;
    public double calculateMonthlyInterest(){
        double interest= (savingsBalance*(annualInterestRate/100))/12;
        savingsBalance=savingsBalance+interest;
        return interest;
    }
    public static void setInterestRate(float rate)
    {
        annualInterestRate=rate;
    }
    public void deposit(double money)
    {
        this.savingsBalance=savingsBalance+money;
    }
    public String toString()
    {
        return "Total balance:"+savingsBalance;
    }
}