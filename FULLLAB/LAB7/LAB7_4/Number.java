import java.io.*;

public class Number {
    int num;
    public Number(int a) {
        this.num= a;
    }

    public String toString() {
        return ""+num+"\n";
    }

    public void check() throws IOException,PrimeException {
        FileWriter fw = new FileWriter("Out.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            count++;
        }
        try {
            if (count==2)
                throw new PrimeException(num);
            else
                bw.write(num+" ");
        } catch (PrimeException p) {
            System.out.println(p);
        }
        finally{
            bw.close();
            fw.close();
        }

    }

}
