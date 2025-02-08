import java.io.*;
import java.util.*;
public class Demo {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        FileReader fr=new FileReader("ShoppingCart.txt");
        BufferedReader br=new BufferedReader(fr);
        String S="";
        list n=new list();
        while((S=br.readLine())!=null)
        {
            StringTokenizer st=new StringTokenizer(S);
            String id=st.nextToken();
            String name=st.nextToken();
            float price=Float.parseFloat(st.nextToken());
            int quantity=Integer.parseInt(st.nextToken());
            n.insert(id, name, price, quantity);
        }
        br.close();
        fr.close();
        int choice=0;
        do{
            System.out.println("\n0:Exit \n1:Display Cart Items \n2:Insert an item  \n3:Delete an element from cart \n4:Update any item \n");
            System.out.print("Enter choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    n.display();
                    break;
                case 2:
                    System.out.print("Enter product id:");
                    String id=sc.next();
                    System.out.print("Enter product name:");
                    String name=sc.next();
                    System.out.print("Enter price:");
                    float price=sc.nextInt();
                    System.out.print("Enter quantity:");
                    int quantity=sc.nextInt();
                    n.insert(id, name, price, quantity);
                    break;
                case 3:
                    System.out.print("Enter product ID to delete:");
                    id=sc.next();
                    n.remove(id);
                    break;
                case 4:
                    System.out.print("Enter id:");
                    id=sc.next();
                    System.out.print("Enter updated quantity:");
                    quantity=sc.nextInt();
                    n.update(id,quantity);
                    break;
                default:
                    System.out.println("Enter correct option");
            }

        }while(choice!=0);
        n.updatedFile();
        sc.close();   
    }
}
