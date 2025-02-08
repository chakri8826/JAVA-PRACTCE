public class Demo {
    public static void main(String[] args) {
        Date d=new Date(25, "July", 2004);
        Time t=new Time(12, 45, 54);
        DateAndTime n=new DateAndTime(d, t);
        System.out.println(n);

    }
}
