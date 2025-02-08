import java.io.*;

public class Registrar extends Thread {
    StudentBuffer s;
    int count;

    public Registrar(StudentBuffer s,int count) {
        this.s = s;
        this.count=count;
    }

    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < count; i++) {
                System.out.print("Enter name:");
                String name=br.readLine(); 
                System.out.print("Enter age:");
                int age=Integer.parseInt(br.readLine());
                Student temp=new Student(name, age);
                s.push(temp);
            }
        } catch (Exception e) {}

    }

}
