// 5. The squirrels in Palo Alto spend most of the day playing. In particular, they play
// if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the
// upper limit is 100 instead of 90. Given an int temperature and a boolean
// isSummer, return true if the
// squirrels play and false otherwise.
// E.g.
// squirrelPlay(70, false) → true
// squirrelPlay(95, false) → false
// squirrelPlay(95, true) → true
import java.util.*;
public class SquirrelPlay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature:");
        int t=sc.nextInt();
        System.out.print("Enter is Summer or not(true or false):");
        boolean isSummer=sc.nextBoolean();
        boolean result;
        if((t>=60 && t<=90 ) && isSummer==false)
        {
            result=true;
        }
        else if((t>=60 && t<=100 ) && isSummer==true)
        {
            result=true;
        }
        else
        {
            result=false;
        }
        System.out.println("squirrelPlay("+t+","+isSummer+")-->"+result);
        sc.close();
    }
}
