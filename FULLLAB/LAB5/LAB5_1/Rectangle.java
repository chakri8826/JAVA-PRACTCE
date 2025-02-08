public class Rectangle extends shape{
    double length;
    double width;
    public Rectangle(){}
    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public Rectangle(double length,double width,String color,boolean F)
    {
        this.length=length;
        this.width=width;
        this.color=color;
        this.filled=F;
    }
    public double getWidth()
    {
        return this.width;
    }
    public double getLength()
    {
        return this.length;
    }
    public void setwidth(double w)
    {
        this.width=w;
    }
    public void setLength(double l)
    {
        this.length=l;
    }
    public double getArea()
    {
        return (length*width);
    }
    public double getPerimeter()
    {
        return 2*(length+width);
    }
    public String toString()
    {
        return " Rectangle: \nlength:"+length+" Width:"+width+" color:"+color+" Filled:"+filled;
    }
}
