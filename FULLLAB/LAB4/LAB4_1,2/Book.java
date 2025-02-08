public class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity;
    private int pages;
    public Book(String name, Author author, double price, int quantity, int pages)
    {
        this.name=name;
        this.author =author;
        this.price=price;
        this.quantity=quantity;
        this.pages=pages;
    }
    public String toString()
    {
        return "Book Name:"+name+" Author"+author+" Price"+price+" Quantity"+quantity+" Pages"+pages;

    }
    public String getName()
    {
        return this.name;
    }
    public Author getAuthor()
    {
        return this.author;
    }
    public double getPrice()
    {
        return this.price;
    }
    public int getQuantity()
    {
        return this.quantity;
    }
    public int getPages()
    {
        return pages;
    }


}
