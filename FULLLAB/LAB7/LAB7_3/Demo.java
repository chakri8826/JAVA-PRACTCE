import java.io.*;
public class Demo {
    public static void main(String[] args) throws NumericException,IOException{
        Student s1=new Student("revanth", 19);
        try{
        s1.check();
        }
        catch(NumericException p)
        {
            System.out.println(p);
        }
    }
}
