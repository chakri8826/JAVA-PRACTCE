//Write a java program to Check the given year is Leap year or not.
public class Lab1_4 {
    public static void main(String args[])
    {
        int year=2000;
        if((year%400==0)||((year%4==0)&&(year%100!=0)))
        {
            System.out.println(year+" is a Leap year");
        }
        else
        {
            System.out.println(year+" is not a Leap year");
        }
    } 
}
