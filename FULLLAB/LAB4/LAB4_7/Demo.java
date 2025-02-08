import java.io.*;
public class Demo {
    public static void main(String[] args) throws IOException{
        Person p[]=new Person[5];
        for(int i=0;i<5;i++)
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter name:");
            String s=br.readLine();
            int a=Integer.parseInt(br.readLine());
            p[i]=new Person(s,a);
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(p[i]);
        }
    }
    
}
