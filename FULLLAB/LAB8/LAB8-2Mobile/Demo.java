import java.util.*;
import java.io.*;
public class Demo {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        FileReader fr=new FileReader("MobileShop.txt");
        BufferedReader br=new BufferedReader(fr);
        String S="";
        mobilelist n=new mobilelist();
        while((S=br.readLine())!=null)
        {
            StringTokenizer st=new StringTokenizer(S);
            String cName=st.nextToken();
            String mName=st.nextToken();
            float price=Float.parseFloat(st.nextToken());
            n.insert(cName,mName,price);
        }
        br.close();
        fr.close();
        int choice=0;
        do{
            System.out.println("\n0:Exit \n1:Display mobile Items \n2:add a mobile  \n3:Delete a mobile  \n4:Update mobile_model_name \n");
            System.out.print("Enter choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    n.display();
                    break;
                case 2:
                    System.out.print("Enter Company name:");
                    String cName=sc.next();
                    System.out.print("Enter Model name:");
                    String mName=sc.next();
                    System.out.print("Enter price:");
                    float price=sc.nextInt();
                    n.insert(cName,mName,price);
                    break;
                case 3:
                    System.out.print("Enter model Name to delete:");
                    mName=sc.next();
                    n.remove(mName);
                    break;
                case 4:
                    System.out.print("Enter model Name::");
                    mName=sc.next();
                    System.out.print("Enter updated model Name:");
                    String nmName=sc.next();
                    n.update(mName,nmName);
                    break;
                default:
                    System.out.println("Enter correct option");
            }

        }while(choice!=0);
        n.updatedFile();
        sc.close();
        
    }
    
}
