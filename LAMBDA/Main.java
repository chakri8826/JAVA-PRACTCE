import java.util.*;
class Main {
    public static void main(String[] args) {
        // Shape s = new Square();
        // s.printName();

        Shape s1 = () -> System.out.println("Iam a triangle");
        Shape s2 = () -> System.out.println("Iam a Square");
        Shape s3 = () -> {
            System.out.println("Iam a shape");
            System.out.println("Iam a s32");
            System.out.println("Iam a s33");
        };
        // s3.printName();

        //Lambda with parameters
        Calculator c1 = (a,b)->{
            return a*b;
        };
        // System.out.println(c1.solve(2,3));


        //COLLECTIONS
        Comparator<Integer> comp1 = (a,b) -> b-a;
        TreeMap<Integer,Integer> map = new TreeMap<>(comp1);
        map.put(7,1);
        map.put(77,1);
        map.put(177,1);
        map.put(17,1);
        System.out.println(map);



    }
}
