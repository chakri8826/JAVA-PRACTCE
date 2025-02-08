import java.io.*;
public class mobilelist {
    mobile start = null;

    void insert(String cName,String mName,float price) {
        mobile N = new mobile(cName,mName,price);
        if (start == null) {
            start = N;
        } else {
            mobile temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = N;
        }
    }

    public void update(String modelName, String n) {
        mobile temp = start;
        while (!temp.model_Name.equals(modelName)) {
            temp = temp.next;
        }
        temp.model_Name = n;
    }

    public void display() {
        mobile temp = start;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void remove(String mName) {
        mobile pre = start;
        mobile ptr = start;
        if (start.model_Name.equals(mName)) 
        {
            start = start.next;
        } 
        else
        {
            while (ptr.next != null) 
            {
                pre = ptr;
                ptr = ptr.next;
                if(ptr.model_Name.equals(mName))
                {
                    pre.next=ptr.next;
                    break;
                }
            }
            if(ptr.model_Name.equals(mName) && ptr.next==null)
            {
                pre.next=null;
            }
        }
    }
    void updatedFile() {
        try {
            FileWriter fw = new FileWriter("updated.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            mobile current = start;
            while (current != null) {
                bw.write(current.company_Name);
                bw.write(" " + current.model_Name);
                bw.write(" " + current.price+" ");
                current = current.next;
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
    
}
