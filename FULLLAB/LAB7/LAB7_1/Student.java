import java.io.*;

public class Student {
    String name;
    int age;
    double percentage;

    public Student(String n, int a, double p) {
        this.name = n;
        this.age = a;
        this.percentage = p;
    }

    public String toString() {
        return "Name:" + name + "Age:" + age + " Percentage" + percentage;
    }

    public void check() throws IOException, PercentageException {
        FileWriter fw = new FileWriter("Out.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            if (percentage < 50.0)
                throw new PercentageException();
            else
                bw.write("Name:" + name + "Age:" + age + " Percentage" + percentage+"\n");
        } catch (PercentageException p) {
            System.out.println(p);
        }
        finally{
            bw.close();
            fw.close();
        }

    }

}
