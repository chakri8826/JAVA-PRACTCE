import java.util.*;
class MyCom implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
            if(o1<o2) return 1;
            if(o1>o2) return -1;
            return 0;
    }
}
public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);
        System.out.println(p);
        // //System.out.println(p.peek());
        // p.forEach((x)->System.out.println(x));    //3,10,5.20.15,30 (min-Heap) print avutindi
        // p.poll();
        // System.out.println("\n");
        // p.forEach((x)->System.out.println(x));

        // PriorityQueue<Integer> pm = new PriorityQueue<>(new MyCom()); //behaves as Max-Heap.
        // pm.add(20);
        // pm.add(10);
        // pm.add(30);
        // pm.add(5);
        // pm.add(15);
        // pm.add(3);
        // // pm.forEach((x)->System.out.println(x)); 
        // System.out.println(pm);
    }
}
