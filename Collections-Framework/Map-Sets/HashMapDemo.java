import java.util.*;
public class HashMapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> tm = new HashMap<>(Map.of(0,"A",1,"B",2,"c",3,"D"));
        tm.put(4,"E");   // (IMP)
        tm.put(5,"F");
        System.out.println(tm.get(0));
    }
}

