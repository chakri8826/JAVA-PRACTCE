public class HardwareBooks extends Book {
    String hardware_category;
    String publisher;
    public HardwareBooks(String name,String title,float price,int pages,String category,String publisher){
        super(name,title,price,pages);
        this.hardware_category=category;
        this.publisher=publisher;
    }
    public String toString()
    {
        return "Name:"+author_name+" Title:"+title+" Price:"+price+" Pages:"+pages+" Hardware Category:"+hardware_category+" Publisher:"+publisher;
    }
}
