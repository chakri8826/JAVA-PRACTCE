//8. Write a java program to Find maximum of three numbers.
public class Lab1_8 {
    public static void main(String args[])
    {
        int a=15,b=19,c=16;
        int max;
        max=(a>b && a>c)?a:(b>c)?b:c;
        System.out.println("Maximum of the numbers "+a+","+b+","+c+" is "+max);
    }
    
}
