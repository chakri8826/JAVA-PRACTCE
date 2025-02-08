package src;
class Library1{
    String [] books;
    int no_of_books;
    Library1(){
        this.books= new String[100];
        this.no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" book has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available books in the library are: ");
        for(String book:this.books){
            if (book == null) {
                continue;
            }
            System.out.println("* " +book);
        }
    }
    void issueBook(String book){
            for(int i=0;i<this.books.length;i++){
                if(this.books[i]!=null){
                    if(this.books[i].equals(book)){
                    System.out.println(book +" book has been issued");
                    this.books[i]=null;
                    return;
                    }
                }
            }
            System.out.println("This book doesn't exists");
    }
    void returnBook(String book){
        this.books[no_of_books]=book;
        System.out.println("Successfully " +book+ " book has been returned");
    }
}
public class Exercise4_Correct_Process {
    public static void main(String[] args){
            Library1 l= new Library1();
            l.addBook("Python");
            l.addBook("Java");
            l.addBook("Jesus");

            l.showAvailableBooks();
//
            l.issueBook("Java");

            l.showAvailableBooks();
            l.returnBook("C");
            l.showAvailableBooks();

    }
}
