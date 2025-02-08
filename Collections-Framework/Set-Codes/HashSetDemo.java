import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        // HashSet<Integer> has = new HashSet<>(10,0.25f);
        // has.add(15);
        // has.add(28);
        // has.add(42);
        // has.add(35);
        // System.out.println(has);
        Set has = new HashSet<>();
        has.add(1);
        has.add(2);
        has.add("a"+1);
        System.out.println(has);

    }
}
