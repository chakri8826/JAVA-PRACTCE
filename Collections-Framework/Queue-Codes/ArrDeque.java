import java.util.*;
public class ArrDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(10);//adds ele to last of the array
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.offerFirst(1);//adds ele to first of the array
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);
        dq.poll();
        dq.pollLast();
        dq.offer(50);
        System.out.println(dq);
    }
}
