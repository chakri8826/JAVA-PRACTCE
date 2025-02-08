import java.io.*;
import java.util.*;
public class Demo {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        FileReader fr=new FileReader("subscriberDetails.txt");
        BufferedReader br=new BufferedReader(fr);
        String S="";
        list n=new list();
        while((S=br.readLine())!=null)
        {
            StringTokenizer st=new StringTokenizer(S);
            String id=st.nextToken();
            String name=st.nextToken();
            float price=Float.parseFloat(st.nextToken());
            n.insert(id, name, price);
        }
        br.close();
        fr.close();
        int choice=0;
        do{
            System.out.println("\n0:Exit \n1:Display  \n2:Insert a Subscriber  \n3:Delete a subscriber \n4:search \n5:Sort \n");
            System.out.print("Enter choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                    break;
                case 1:
                    n.display();
                    break;
                case 2:
                    System.out.print("Enter Subscriber id:");
                    String id=sc.next();
                    System.out.print("Enter Subscriber name:");
                    String name=sc.next();
                    System.out.print("Enter price:");
                    float price=sc.nextInt();
                    n.insert(id, name, price);
                    break;
                case 3:
                    System.out.print("Enter subscriber ID to delete:");
                    id=sc.next();
                    n.delete(id);
                    break;
                case 4:
                    System.out.print("Enter subscriber id to search:");
                    id=sc.next();
                    n.search(id);
                    break;
                case 5:
                    n.sort();
                    break;
                default:
                    System.out.println("Enter correct option");
            }

        }while(choice!=0);
        n.updatedFile();
        sc.close();
        
    }
    
}
