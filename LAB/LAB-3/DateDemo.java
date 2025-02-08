class Date{
	private int day;
	private String month;
	private int year;
	Date(int day,String month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void setDay(int day){
		this.day=day;
	}
	public void setMonth(int Month){
		this.month=month;
	}
	public void setYear(int year){
		this.year=year;
	}
	public int getDay(){
		return day;
	}
	public String getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	
	public String toString(){
		return day+"/"+month+"/"+year;
	}
}
class Time{
	private int hour;
	private int minutes;
	private int seconds;
	Time(int hour,int minutes,int seconds){
		this.hour=hour;
		this.minutes=minutes;
		this.seconds=seconds;
	}
	public void setHour(int hour){
		this.hour=hour;
	}
	public void setMin(int min){
		this.minutes=min;
	}
	public void setSeconds(int sec){
		this.seconds=sec;
	}
	public int getHour(){
		return hour;
	}
	public int getMin(){
		return minutes;
	}
	public int getSec(){
		return seconds;
	}
	
	public String toString(){
		return hour+":"+minutes+":"+seconds;
	}

}

class DateAndTime{
	private Date d;
	private Time t;
	DateAndTime(Date d,Time t){
		this.d=d;
		this.t=t;
	}
	public void setDate(Date d){
		this.d=d;
	}
	public void setTime(Time t){
		this.t=t;
	}
	public Date getDate(){
		return d;
	}
	public Time t(){
		return t;
	}
	public String toString(){
		return d.toString()+"-"+t.toString();
	}
}

class DateDemo{
	public static void main(String[] args){
		Date d = new Date(06,"August",2004);
		System.out.println(d);
		
		Time t = new Time(12,14,59);
		System.out.println(t);
		
		DateAndTime dt = new DateAndTime(d,t);
		System.out.println(dt);	
	}
	
	
	
	
	
}
