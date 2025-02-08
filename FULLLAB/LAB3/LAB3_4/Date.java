public class Date{
    private int day;
    private String month;
    private int year;
    public Date(int d,String m,int y)
    {
        this.day=d;
        this.month=m;
        this.year=y;
    }
    public int getDay()
    {
        return day;
    } 
    public int getYear()
    {
        return year;
    }
    public String getMonth()
    {
        return month;
    }
    public void setDay(int d)
    {
        this.day=d;
    }
    public void setMonth(String m)
    {
        this.month=m;
    }
    public void setYear(int y)
    {
        this.year=y;
    }
    public String toString()
    {
        return day+":"+month+":"+year;
    }
}