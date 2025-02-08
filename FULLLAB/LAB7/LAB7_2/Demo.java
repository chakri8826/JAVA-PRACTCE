import java.io.*;

public class Demo {
    public static void main(String[] args) throws AgeException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            
            System.out.print("Enter name:");
            String name = br.readLine();
            System.out.print("Enter age:");
            int age = Integer.parseInt(br.readLine());
            Voter s1 = new Voter(name, age);
            try {
                s1.check();
            } catch (AgeException p) {
                System.out.println(p);
            }
        }
    }
}