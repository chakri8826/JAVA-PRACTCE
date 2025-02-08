public class PrimeException extends Exception{

    int num;
    public PrimeException(int num)
    {
        this.num=num;
    }
    public String toString()
    {
        return "PrimeException "+num+"\n";
    }
}