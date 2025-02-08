import java.io.*;
import java.util.*;

public class MovieDemo {
    public static void main(String[] args) throws IOException {
        list movies=new list();
        FileReader fr = new FileReader("MoviesList.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            String movie_Name=st.nextToken();
            String hero_Name=st.nextToken();
            String director_Name=st.nextToken();
            float gross_Collections=Float.parseFloat(st.nextToken());
            movies.insert(movie_Name, hero_Name, director_Name, gross_Collections);
        }
        br.close();
        fr.close();
        int n=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("............................");
            System.out.print("Enter \n0.Exit \n1.Add Node \n2.Delete Node \n3.print list \n4.sort \nEnter choice:");
            n=sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.print(" Enter movie details \nMovie name:");
                    String m=sc.next();
                    System.out.print("Hero name:");
                    String h=sc.next();
                    System.out.print("Director name:");
                    String d=sc.next();
                    System.out.print("Gross collections:");
                    float c=sc.nextFloat();
                    movies.insert(m, h, d, c);
                    break;
                case 2:
                    System.out.print("Enter movie name to delete:");
                    m=sc.next();
                    movies.DeleteByName(m);
                    break;
                case 3:
                    movies.print();
                    break;
                case 4:
                    movies.sort();
                    break;
                default:
                    break;
            }
        }while(n!=0);
        movies.sort();
        movies.sortedFile();
        sc.close();
    }
}
