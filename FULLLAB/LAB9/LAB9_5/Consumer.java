import java.io.*;
public class Consumer extends Thread {
    Number n;
    public Consumer(Number n) {
        this.n = n;
    }
    public void run() {
        try {
            FileWriter fw = new FileWriter("Prime.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < 30; i++) {
                int num = n.pop();
                System.out.println(num);
                bw.write(num + "\n");
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
}
