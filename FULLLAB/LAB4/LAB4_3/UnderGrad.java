public class UnderGrad extends Student{
    public UnderGrad(String name,String id,double grade,int age,String address)
    {
        super(name,id,grade,age,address);
    }
    public boolean isPassed(double grade)
    {
        if(grade>70)
        return true;
        else
        return false;
    }
}
