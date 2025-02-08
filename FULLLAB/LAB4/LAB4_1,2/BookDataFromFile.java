import java.io.*;
import java.util.StringTokenizer;
public class BookDataFromFile {
    public static void main(String[] args) throws IOException{
        FileReader frr=new FileReader("BooksData.txt");
        BufferedReader brr=new BufferedReader(frr);
        String S;
        int size=0;
        while((S=brr.readLine())!=null)
        {
            size++;
        }
        Book array[]=new Book[size];
        brr.close();
        frr.close();
        int index=0;
        FileReader fr=new FileReader("BooksData.txt");
        BufferedReader br=new BufferedReader(fr);
        while((S=br.readLine())!=null)
        {
            StringTokenizer str=new StringTokenizer(S);
            String bName=str.nextToken();
            String name=str.nextToken();
            int age=Integer.parseInt(str.nextToken());
            String email=str.nextToken();
            String gender=str.nextToken();
            double price=Double.parseDouble(str.nextToken());
            int quantity=Integer.parseInt(str.nextToken());
            int pages=Integer.parseInt(str.nextToken());
            Author author=new Author(name,age,email,gender);
            array[index]=new Book(bName,author,price,quantity,pages);
            index++;
        }
        br.close();
        fr.close();
        FileWriter fw=new FileWriter("BooksData Sorted.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        for(int i=0;i<index;i++)
        {
            for(int j=i+1;j<index;j++)
            {
                if((array[i].getName()).compareTo(array[j].getName())>0){
                Book temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                }
            }
        }

        for(int i=0;i<index;i++)
        {
            bw.write(array[i].getName()+" ");
            bw.write((array[i].getAuthor()).getName()+" ");
            bw.write((array[i].getAuthor().getAge())+" ");
            bw.write((array[i].getAuthor().getEmail())+" ");
            bw.write((array[i].getAuthor().getGender())+" ");
            bw.write(array[i].getPrice()+" ");
            bw.write(array[i].getQuantity()+" ");
            bw.write(array[i].getPages()+"\n");
        }
        bw.close();
        fw.close();


        
    }
    
}
