import java.util.*;
public class Demo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        double m=sc.nextDouble();
        Number n=new Number(m);
        System.out.println("is Zero:"+n.isZero());
        System.out.println("is Positive:"+n.isPositive());
        System.out.println("is Negative:"+n.isNegative());
        System.out.println("is Odd:"+n.isOdd());
        System.out.println("is Even:"+n.isEven());
        System.out.println("is Prime:"+n.isPrime());
        System.out.println("is Amstrong:"+n.isAmstrong());
        System.out.println("Factorial :"+n.getFactorial());
        System.out.println("Square root :"+n.getSqrt());
        System.out.println("Square :"+n.getSqr());
        System.out.println("Sum Digits :"+n.sumDigits());
        System.out.println("Reverse :"+n.getReverse());
        sc.close();
    }
    
}
