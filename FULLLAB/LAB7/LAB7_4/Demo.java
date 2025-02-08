import java.io.*;
import java.util.*;
public class Demo {
    public static void main(String[] args) throws PrimeException,IOException{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num:");
        int n=sc.nextInt();
        Number s1=new Number(n);
        try{
        s1.check();
        }
        catch(PrimeException p)
        {
            System.out.println(p); 
        }
        sc.close();
    }
}
