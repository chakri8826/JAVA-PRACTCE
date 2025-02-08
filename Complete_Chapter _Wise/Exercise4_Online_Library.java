package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
interface Lib{
    String[] Bookslist();
    void issueBook(String book);
    void addBook(String b);

//    void returnBook();

}
class Library implements Lib{
    String[] bl={"Java1","Java2","Java3","Java4"};
    int n=bl.length;
    public String[] Bookslist(){
        return bl;
    }
    public void issueBook(String book){
        int a=1;
        for(int i=0;i<bl.length;i++){
            if(book.equals(bl[i])){
                System.out.println("You have been issued "+ book + " Please keep it safe and return with in 30 days");
                a=0;
            }
        }
        if(a==1){
            System.out.println("Sorry requested book is not present in our library.");

        }

    }
    public void addBook(String b){
//        String[] nA = Arrays.copyOf(bl,n+1);
//        nA[n]=b;
        ArrayList<String> bl = new ArrayList<>();
        bl.add(b);
        System.out.println(b+" book has been succesfully added to the library");
    }


}
public class Exercise4_Online_Library {
    public static void main(String[] args){
        //You have to implement a Library using Java class Library
        //Properties: addBook, issueBook, returnBook, showAvailableBooks
        //Array: Array to store the available books,
        // Array to store the issued books

        while(true){
            System.out.println("-----Welcome to the Central Library-----");
            System.out.println("Please choose the option:");
            System.out.println("1.List all the Books\n2.Request a book\n3.Add/Return a Book\n4.Exit the library.");
            System.out.println("Enter a choice: ");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            Library l=new Library();
            if(a==1){
                System.out.println("The Available books in the library are: ");
                String[] bl=l.Bookslist();
                for(String item:bl){
                    System.out.println(item);
                }
            }
            else if(a==2) {
                System.out.println("Enter the name of the book you want to borrow");
                String b=sc.next();
                l.issueBook(b);
            }
            else if(a==3){
                System.out.println("Enter the name of the book you want to add");
                String bo=sc.next();
                l.addBook(bo);

            }


        }
    }
}
