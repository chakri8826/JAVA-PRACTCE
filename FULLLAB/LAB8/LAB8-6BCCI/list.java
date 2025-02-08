import java.io.*;
public class list {
    player start=null;
    int count=0;
    void insert(String name,int runs,int matches)
    {
        player newNode=new player(name,runs,matches);
        if(start==null)
        start=newNode;
        else
        {
            player temp=start;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        count++;
    }
    void delete(String name)
    {
        if(start.playerName.equals(name))
        start=start.next;
        else
        {
            player pre=start;
            player temp=start;
            int found=0;
            while(temp.next!=null)
            {
                pre=temp;
                temp=temp.next;
                if(temp.playerName.equals(name))
                {
                    pre.next=temp.next;
                    found=1;
                    break;
                }
            }
            if(temp.playerName.equals(name) && temp.next==null)
            {
                pre.next=null;
            }
            if(found==0)
            {
                System.out.println("Given player not found");
            }
        }
        count--;
    }
    void display()
    {
        player temp=start;
        while(temp!=null)
        {
            System.out.println(temp);
            temp=temp.next;
        }
    }
    void search(String name)
    {
        player temp=start;
        int found=0;
        while(temp!=null)
        {
            if(temp.playerName.equals(name))
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
            player pre=null;
            player curr=start;
            player post=start.next;
            while(in<out)
            {
                if(curr.averageScore>post.averageScore)
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
            player current = start;
            while (current != null) {
                bw.write(current.playerName);
                bw.write(" " + current.totalRuns);
                bw.write(" " + current.totalMatches+"\n");
                current = current.next;
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
    
}