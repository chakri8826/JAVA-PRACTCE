import java.util.*;
public class ListDemo{
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList(List.of(50,60,70,80));
        al1.add(2);
        al1.add(0,1);
        //al1.addAll(al2);  //adds all ele's of al2 to al1
        al1.addAll(1,al2); //adds all ele's of al2 to al1 from ind 1 of al1
        al1.set(5,100);
        // System.out.println(al1.contains(2)); //returns true if ele present in al1

        // System.out.println(al1.get(4));

        // System.out.println(al1.indexOf(2));
        // System.out.println(al1);

        //ITERATING ALL THE ELEMENTS
        //for loop
        // for(int i=0;i<al1.size();i++){
        //     System.out.println(al1.get(i));
        // }

        //for each loop
        // for(int x:al1){
        //     System.out.println(x);
        // }

        //Using iterator
        // ListIterator<Integer> it = al1.listIterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // for(ListIterator<Integer> it = al1.listIterator();it.hasNext();){
        //     System.out.println(it.next());
        // }

        // al1.forEach(n->System.out.println(n));
            // al1.forEach(System.out::println);
            al1.forEach(n->show(n));
    }
    static void show(int n){
        if(n>60){
            System.out.println(n);
        }
    }

}

