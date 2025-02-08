public class DateAndTime {
    Date d;
    Time t;
    public DateAndTime(Date d,Time t)
    {
        this.d=d;
        this.t=t;
    }
    public Date getDate()
    {
        return d;
    }
    public void setDate(Date dd)
    {
        this.d=dd;
    }
    public Time getTime()
    {
        return t;
    }
    public void setTime(Time tt)
    {
        this.t=tt;
    }
    public String toString()
    {
        return"Date - "+d+"\nTime - "+t;
    }
}
