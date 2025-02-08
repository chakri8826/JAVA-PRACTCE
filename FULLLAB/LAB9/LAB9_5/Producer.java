import java.util.*;

public class Producer extends Thread {
    Number n;

    Producer(Number n) {
        this.n = n;
    }

    public void run() {
        Random r = new Random();
        for (int i = 0; i < 30;) {
            int num = r.nextInt(100);
            int count=0;
            for(int j=1;j<=num;j++)
            {
                if(num%j==0)
                count++;
            }
            if(count==2)
            {
                n.push(num);
                i++;
            }
        }
    }
}
