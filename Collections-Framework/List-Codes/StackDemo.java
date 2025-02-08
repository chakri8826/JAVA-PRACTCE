import java.util.*;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.push(6);
        s.pop();
        System.out.println(s);
    }
}
