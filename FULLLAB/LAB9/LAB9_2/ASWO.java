import java.io.*;

public class ASWO extends Thread 
{
    Buffer b;
    int count;
    public ASWO(Buffer b,int count) 
    {
        this.b = b;
        this.count=count;
    }

    public void run() {
        try 
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for (int i=0; i< count;) 
            {
                System.out.println("Enter name,ID,maxLeaves,Reason");
                String name = br.readLine();
                String Id = br.readLine();
                int leaves = Integer.parseInt(br.readLine());
                String reason = br.readLine();
                Outpass o = new Outpass(name, Id, leaves, reason);
                if(leaves>5)
                {
                    System.out.println("Leaves not issued for "+o);
                }
                else
                {
                    b.push(o);
                    i++;
                }
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }

}
