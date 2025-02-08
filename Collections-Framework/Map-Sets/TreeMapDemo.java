import java.util.*;
import java.util.Map.*;
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0,"A",1,"B",2,"c",3,"D"));
        tm.put(4,"E");   // (IMP)
        tm.put(5,"F");
        // System.out.println(tm.get(3)); // (IMP) ichina key ki unde value ni istundi.
        // System.out.println(tm.ceilingEntry(5).getValue()); // ichina key ki greater or equal unde value istundi
        // System.out.println(tm);
        // System.out.println(tm.firstKey()); returns smallest key
        // System.out.println(tm.containsValue("b")); //value unte true leda false.

        Entry<Integer,String> e = tm.firstEntry();
        System.out.println(e.getKey()+" "+e.getValue());
    }
}
