public class BookDemo {
    public static void main(String[] args) {
        Author author=new Author("Revanth",18,"jrevanth101@gmail.com","Male");
        Book b=new Book("Best Friends",author,100,500,250);
        System.out.println(b);
    }
    
}
