import java.io.*;
public class BookKeeper extends Thread{
    Buffer c;
    public BookKeeper(Buffer c)
    {
        this.c=c;
    }
    public void run()
    {
        try{
            FileWriter fw=new FileWriter("Customers.txt");
            BufferedWriter bw=new BufferedWriter(fw);
        for(int i=0;i<2;i++)
        {
            Customer c1=c.pop();
            System.out.println(c1);
            bw.write(c1+" \n");
        }
    bw.close();
    fw.close();
    }catch(Exception e){}
    }
}
