import java.io.*;

public class Student {
    String name;
    int age;

    public Student(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String toString() {
        return "Name:" + name + "Age:" + age ;
    }

    public void check() throws IOException,NumericException {
        FileWriter fw = new FileWriter("Out.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        int hasNumber=0,i=0;
        while(i<name.length())
        {
            if(name.charAt(i)>='0' && name.charAt(i)<='9')
            {
                hasNumber=1;
                break;
            }
            i++;
        }
        try {
            if (hasNumber==1)
                throw new NumericException();
            else
                bw.write("Name:" + name + "Age:" + age +"\n");
        } catch (NumericException p) {
            System.out.println(p);
        }
        finally{
            bw.close();
            fw.close();
        }

    }

}
