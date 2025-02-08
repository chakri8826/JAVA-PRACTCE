public class Time {
    private int hour,minutes,seconds;
    public Time(int h,int m,int s)
    {
        this.hour=h;
        this.minutes=m;
        this.seconds=s;
    }
    public int getHour()
    {
        return hour;
    }
    public int getMin()
    {
        return minutes;
    }
    public int getSec()
    {
        return seconds;
    }
    public void setHour(int h)
    {
        this.hour=h;
    }
    public void setMin(int m)
    {
        this.minutes=m;
    }
    public void setSec(int s)
    {
        this.seconds=s;
    }
    public String toString()
    {
        return hour+":"+minutes+":"+seconds;
    }
    
}
