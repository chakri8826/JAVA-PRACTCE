import java.io.*;
public class list {
    BSNL start=null;
    int count=0;
    void insert(String Sid,String Sname,float b)
    {
        BSNL newNode=new BSNL(Sid, Sname, b);
        if(start==null)
        start=newNode;
        else
        {
            BSNL temp=start;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        count++;
    }
    void delete(String id)
    {
        if(start.Subscriber_Id.equals(id))
        start=start.next;
        else
        {
            BSNL pre=start;
            BSNL temp=start;
            int found=0;
            while(temp.next!=null)
            {
                pre=temp;
                temp=temp.next;
                if(temp.Subscriber_Id.equals(id))
                {
                    pre.next=temp.next;
                    found=1;
                    break;
                }
            }
            if(temp.Subscriber_Id.equals(id) && temp.next==null)
            {
                pre.next=null;
            }
            if(found==0)
            {
                System.out.println("Given subscriber ID not found");
            }
        }
        count--;
    }
    void display()
    {
        BSNL temp=start;
        while(temp!=null)
        {
            System.out.println(temp);
            temp=temp.next;
        }
    }
    void search(String id)
    {
        BSNL temp=start;
        int found=0;
        while(temp!=null)
        {
            if(temp.Subscriber_Id.equals(id))
            {
                System.out.println("Found");
                found=1;
                break;
            }
            temp=temp.next;
        }
        if(found==0)
        {
            System.out.println("Not found");
        }
    }
    void sort()
    {
        int out=count-1;
        while(out>0)
        {
            int in=0;
            BSNL pre=null;
            BSNL curr=start;
            BSNL post=start.next;
            while(in<out)
            {
                if(curr.Subscriber_Id.compareTo(post.Subscriber_Id)>0)
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
    void updatedFile() {
        try {
            FileWriter fw = new FileWriter("sorted.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            BSNL current = start;
            while (current != null) {
                bw.write(current.Subscriber_Id);
                bw.write(" " + current.SubscriberName);
                bw.write(" " + current.balance+"\n");
                current = current.next;
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
    
}
