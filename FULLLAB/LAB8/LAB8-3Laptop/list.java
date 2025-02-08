import java.io.*;
public class list {
    Laptop start=null;
    int count=0;
    public void add(String mn,String sn,float price)
    {
        Laptop n=new Laptop(mn,sn,price);
        if(start==null)
        {
            start=n;
        }
        else
        {
            Laptop ptr=start;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=n;
        }
        count++;
    }
    public void display()
    {
        Laptop ptr=start;
        while(ptr!=null)
        {
            System.out.println(ptr);
            ptr=ptr.next;
        }
    }
    public void update(String sn,String nsn)
    {
        Laptop ptr=start;
        while(ptr!=null)
        {
            if(ptr.serial_No.equals(sn))
            {
                ptr.serial_No=nsn;
                break;
            }
            ptr=ptr.next;
        }
    }
    public void remove(String serial_No)
    {
        if(start.serial_No.equals(serial_No))
        {
            start=start.next;
        }
        else
        {
            Laptop pre=start;
            Laptop ptr=start;
            while(ptr.next!=null)
            {
                pre=ptr;
                ptr=ptr.next;
                if(ptr.serial_No.equals(serial_No))
                {
                    pre.next=ptr.next;
                }
            }
            if(ptr.serial_No.equals(serial_No) && ptr.next==null)
            {
                pre.next=null;
            }
        }
        count--;
    }
    public void sort()
    {
        Laptop pre,curr,post;
        int out=count-1;
        while(out>0)
        {
            pre=null;
            curr=start;
            post=curr.next;
            int in=0;
            while(in<out)
            {
                if(curr.price>post.price)
                {
                    curr.next=post.next;
                    post.next=curr;
                    if(pre==null)
                    {
                        start=post;
                    }
                    else
                    {
                        pre.next=post;
                    }
                    pre=post;
                    post=curr.next;

                }
                else
                {
                    pre=curr;
                    curr=post;
                    post=curr.next;
                }
                in++;
            }
            out--;
        }
    }
    void sortedFile() {
        try {
            FileWriter fw = new FileWriter("sorted.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Laptop current = start;
            while (current != null) {
                bw.write(current.model_Name);
                bw.write(" " + current.serial_No);
                bw.write(" " + current.price+"\n");
                current = current.next;
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
}
