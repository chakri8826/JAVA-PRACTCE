import java.io.*;

public class HOD extends Thread {
    Buffer b;
    int count;
    public HOD(Buffer b,int count) {
        this.b = b;
        this.count=count;
    }
    public void run() {
        try{
            FileWriter fw=new FileWriter("ApprovedLeaves.txt",true);
            BufferedWriter bw=new BufferedWriter(fw);
        for (int i = 0; i < 2; i++) {
            Outpass o = b.pop();
            System.out.println("Approved" + o);
            bw.write(o+"\n");
            
        }
    bw.close();
    fw.close();
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
