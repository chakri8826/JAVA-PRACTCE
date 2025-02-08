package src;
import java.util.Scanner;

public class CH1_06_Ex_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ent3et the marks of SUB1: ");
        int a = sc.nextInt();
        System.out.println("Ent3et the marks of SUB2: ");
        int b = sc.nextInt();
        System.out.println("Ent3et the marks of SUB3: ");
        int c = sc.nextInt();
        System.out.println("Ent3et the marks of SUB4: ");
        int d = sc.nextInt();
        System.out.println("Ent3et the marks of SUB5: ");
        int e = sc.nextInt();

        float percent = ((a+b+c+d+e)/500f)*100;
        System.out.print("The average percentage of the student is: ");
        System.out.println(percent);

    }
}
