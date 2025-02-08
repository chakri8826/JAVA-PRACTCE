import java.util.*;
public class Streams{
    public static void main(String[] args){
        List<Integer> al =Arrays.asList(10,15,7,20,40);
        // al.stream();
        // al.forEach(x->System.out.print(x+" "));
        System.out.println();
        al.stream()
          .filter(x -> x > 10)
          .filter(x->x%2==0)
          .forEach(x->System.out.println(x+" "));
    }
}


// import java.util.*;
// public class Streams {
//     public static void main(String[] args) {
//         List<Integer> al = Arrays.asList(10, 15, 7, 20, 40);

//         // First Stream: print all elements
//         al.stream().forEach(x -> System.out.print(x + " "));
//         System.out.println();

//         // Second Stream: filter elements greater than 10 and print them
//         al.stream()
//           .filter(x -> x > 10)
//           .forEach(x -> System.out.print(x + " "));
//         System.out.println();

//         // Third Stream: filter elements greater than 10 and even, then print them
//         al.stream()
//           .filter(x -> x > 10)
//           .filter(x -> x % 2 == 0)
//           .forEach(x -> System.out.print(x + " "));
//     }
// }
