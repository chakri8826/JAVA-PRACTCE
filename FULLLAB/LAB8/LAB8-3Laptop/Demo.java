import java.io.*;
import java.util.*;
public class Demo {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        FileReader fr=new FileReader("stock.txt");
        BufferedReader br=new BufferedReader(fr);
        String S="";
        list n=new list();
        while((S=br.readLine())!=null)
        {
            StringTokenizer st=new StringTokenizer(S);
            String model_Name=st.nextToken();
            String serial_No=st.nextToken();
            float price=Float.parseFloat(st.nextToken());
            n.add(model_Name, serial_No, price);
        }
        br.close();
        fr.close();
        int choice=0;
        do{
            System.out.println("\n0:Exit \n1:Display Laptop \n2:Add a laptop  \n3:Remove a laptop \n4.Update \n5:Sort laptop \n");
            System.out.print("Enter choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    n.display();
                    break;
                case 2:
                    System.out.print("Enter modelName:");
                    String mn=sc.next();
                    System.out.print("Enter serial no:");
                    String sn=sc.next();
                    System.out.print("Enter price:");
                    float price=sc.nextInt();
                    n.add(mn, sn, price);
                    break;
                case 3:
                    System.out.print("Enter serial No to delete:");
                    sn=sc.next();
                    n.remove(sn);
                    break;
                case 4:
                    System.out.print("Enter serial No:");
                    sn=sc.next();
                    System.out.print("Enter updated serial no:");
                    String nsn=sc.next();
                    n.update(sn,nsn);
                    break;
                case 5:
                    n.sort();
                    n.sortedFile();
                    break;
                default:
                    System.out.println("Enter correct option");
            }

        }while(choice!=0);
        sc.close();
        
    }
    
}
