import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> li1 = new LinkedList<>();
        LinkedList<Integer>li2=new LinkedList<>();
        li2.add(6);
        li2.add(7);

        li1.add(1);
        li1.add(2);
        li1.add(3);
        li1.add(4);
        li1.add(5);
        li1.addAll(li2);

        li1.addFirst(0);
        li1.addLast(9);
        li1.removeFirst();
        li1.removeLast();
        // System.out.println(li1.pop()); //removes first element
        // System.out.println(li1.peek());
        // System.out.println(li1.peekLast());

        // li1.remove(Integer.valueOf(6)); //to remove directly element 
        // System.out.println(li1);
        // for(int i:li1){
        //     System.out.println(i);
        // }
        // li1.remove(0);//removes element at 0 position
        
        // ListIterator<Integer> it = li1.listIterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
     

        // System.out.println(li1.get(2)); // gives value present at 2nd index

        // li1.set(2,9); // sets value 9 at 2nd ind
        // System.out.println(li1);

        // System.out.println(li1.subList(2,5)); //sublist from ind to end-1

        // System.out.println(li1.indexOf(7)); //gives index of given value.if not found gives -1

        // li1.retainAll(li2);  //removes all ele's of li1 and keeps values of li2 only.

        //li1.clear();

        // System.out.println(li1.contains(0));
        // System.out.println(li1.equals(li2));
        // System.out.println(li1.isEmpty());

            // Object[] arr = li1.toArray();// Converting to array
            // for(Object ele:arr){
            //     System.out.println(ele);
            // }
    }
}
