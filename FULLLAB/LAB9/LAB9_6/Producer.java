import java.util.*;

public class Producer extends Thread {
    Number n;

    Producer(Number n) {
        this.n = n;
    }

    public void run() {
        Random r = new Random();
        for (int i = 0; i < 10;) {
            int num = r.nextInt(100);
            if (num % 2 != 0) {
                n.push(num);
                i++;
            }
        }
    }
}
