public class square extends Rectangle{
    double side;
    public square(){}
    public square(double side)
    {
        super(side,side);
        this.side=side;
    }
    public square(double side,String color,boolean F)
    {
        super(side,side,color,F);
        this.side=side;
    }
    public double getSide()
    {
        return this.side;
    }
    public void setSide(double s)
    {
        this.side=s;
        this.length=s;
        this.width=s;
    }
    public String toString()
    {
        return " Square: \nside:"+side+" color:"+color+" Filled:"+filled;
    }
}
