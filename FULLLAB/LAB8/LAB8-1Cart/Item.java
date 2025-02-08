public class Item{
    String id;
    String name;
    float price;
    int quantity=0;
    Item next;
    public Item(String id,String name,float price,int quantity)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.next=null;
    }
    public String toString()
    {
        return "Product ID: "+id+" Name:"+name+" Price:"+price+" Quantity :"+quantity;
    }
}