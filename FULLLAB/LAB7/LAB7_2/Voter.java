import java.io.*;

public class Voter {
    String name;
    int age;

    public Voter(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String toString() {
        return "Name:" + name + "Age:" + age ;
    }

    public void check() throws IOException, AgeException {
        FileWriter fw = new FileWriter("Out.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            if (age < 18)
                throw new AgeException();
            else
                bw.write("Name:" + name + "Age:" + age +"\n");
        } catch (AgeException p) {
            System.out.println(p);
        }
        finally{
            bw.close();
            fw.close();
        }
    }
}