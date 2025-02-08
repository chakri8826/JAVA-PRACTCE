import java.io.*;
public class list {
    Item start = null;

    void insert(String id, String name, float price, int quantity) {
        Item N = new Item(id, name, price, quantity);
        if (start == null) {
            start = N;
        } else {
            Item temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = N;
        }
    }

    public void update(String prodId, int quantity) {
        Item temp = start;
        while (!temp.id.equals(prodId)) {
            temp = temp.next;
        }
        temp.quantity = quantity;
    }

    public void display() {
        Item temp = start;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void remove(String id) {
        Item pre = start;
        Item ptr = start;
        if (start.id.equals(id)) 
        {
            start = start.next;
        } 
        else
        {
            while (ptr.next != null) 
            {
                pre = ptr;
                ptr = ptr.next;
                if(ptr.id.equals(id))
                {
                    pre.next=ptr.next;
                    break;
                }
            }
            if(ptr.id.equals(id) && ptr.next==null)
            {
                pre.next=null;
            }
        }
    }
    void updatedFile() {
        try {
            FileWriter fw = new FileWriter("updated.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Item current = start;
            while (current != null) {
                bw.write(current.id);
                bw.write(" " + current.name);
                bw.write(" " + current.price);
                bw.write(" " + current.quantity + "\n");
                current = current.next;
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
}
