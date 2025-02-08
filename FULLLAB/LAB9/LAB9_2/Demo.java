import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students can approve for leave:");
        int count=sc.nextInt();
        Buffer b=new Buffer();
        ASWO a=new ASWO(b,count);
        HOD h=new HOD(b,count);
        a.start();
        h.start();
        System.out.println("Completed");
    }
    
}
