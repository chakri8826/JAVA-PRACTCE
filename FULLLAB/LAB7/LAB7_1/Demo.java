import java.io.*;
public class Demo {
    public static void main(String[] args) throws PercentageException,IOException{

        Student s1=new Student("revanth", 19, 80.07);
        Student s2=new Student("Asif",45,38.9);
        try{
        s1.check();
        s2.check();
        }
        catch(PercentageException p)
        {
            System.out.println(p);
        }
    }
}
