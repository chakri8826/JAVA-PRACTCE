public class circle extends shape{
    double radius;
    public circle(){}
    public circle(double r)
    {
        this.radius=r;
    }
    public circle(double radius,String color,boolean F)
    {
        this.radius=radius;
        this.color=color;
        this.filled=F;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        return (3.14*radius*radius);
    }
    public double getPerimeter()
    {

        return (2*3.14*radius);
    }
    public String toString()
    {
        return " Circle: \nRadius:"+radius+" color:"+color+" Filled:"+filled;
    }
}
