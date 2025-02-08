import java.io.*;
public class Receptionist extends Thread{
    Buffer c;
    Receptionist(Buffer c)
    {
        this.c=c;
    }
    public void run()
    {
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<2;i++){
        System.out.println("Enter name,age,mail:");
        String name=br.readLine();
        int age=Integer.parseInt(br.readLine());
        String mail=br.readLine();
        Customer c1=new Customer(name, age, mail);
        c.push(c1);}
        }catch(Exception e){}
    }
}
