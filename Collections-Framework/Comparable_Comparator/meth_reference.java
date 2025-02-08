import java.util.*;
public class meth_reference {
    public static void main(String[] args) {
        String arr[] = {"gfg","IDE","GFG"};
        Arrays.sort(arr, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(arr));
    }
    
}
