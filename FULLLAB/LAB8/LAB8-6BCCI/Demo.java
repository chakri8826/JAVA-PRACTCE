import java.io.*;
import java.util.*;
public class Demo {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        FileReader fr=new FileReader("PlayerDetails.txt");
        BufferedReader br=new BufferedReader(fr);
        String S="";
        list n=new list();
        while((S=br.readLine())!=null)
        {
            StringTokenizer st=new StringTokenizer(S);
            String name=st.nextToken();
            int runs=Integer.parseInt(st.nextToken());
            int matches=Integer.parseInt(st.nextToken());
            n.insert(name,runs,matches);
        }
        br.close();
        fr.close();
        int choice=0;
        do{
            System.out.println("\n0:Exit \n1:Display  \n2:Insert a player  \n3:Delete a player \n4:search \n5:Sort \n");
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
                    System.out.print("Enter Name:");
                    String name=sc.next();
                    System.out.print("Enter Total Runs:");
                    int runs =sc.nextInt();
                    System.out.print("Enter Total Matches:");
                    int matches=sc.nextInt();
                    n.insert(name,runs,matches);
                    break;
                case 3:
                    System.out.print("Enter player Name:");
                    name=sc.next();
                    n.delete(name);
                    break;
                case 4:
                    System.out.print("Enter player Name to search:");
                    name=sc.next();
                    n.search(name);
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