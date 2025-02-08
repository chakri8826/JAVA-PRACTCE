import java.io.*;

public class Validator extends Thread {
    StudentBuffer s;
    int count;

    public Validator(StudentBuffer s, int count) {
        this.s = s;
        this.count = count;
    }

    public void run() {
        try {
            FileWriter fw = new FileWriter("Student.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < count; i++) {
                Student S = s.pop();
                if (S.age <35 && S.age > 23) 
                {
                    try 
                    {
                        throw new AgeException(S.age);
                    } 
                    catch (AgeException e) 
                    {
                        System.out.println(e);
                    }
                }
                else
                {
                    bw.write(S+"\n");
                }
            }
            bw.close();
            fw.close();
        } 
        catch (Exception e) {}
    }
}
